package utils;

import java.util.List;
import java.util.Stack;

import model.Node;

public class NodeUtils {

	public static int[][] copyContente(int[][] content) {
		int[][] childContent = new int[content.length][content.length];
		int order = content.length;
		for(int i = 0; i < order; i++) {
			for(int j = 0; j < order; j++) {
				childContent[i][j] = content[i][j];
			}
		}
		return childContent;
	}
	
	public static void printContent(int[][] content) {
		System.out.println("-----");
		for(int i = 0; i < content.length; i++) {
			for(int j = 0; j <  content.length; j++) {
				System.out.print(content[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----");
	}
	
	public static boolean node_in_state(Node node, List<Node> states) {
		for(Node state : states) {
			if(compareContent(node, state)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean compareContent(Node node, Node state) {
		for(int i = 0; i < node.getContent().length; i++) {
			for(int j = 0; j < node.getContent().length; j++) {
				if(node.getContent()[i][j] != state.getContent()[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean queueContainsNode(List<Node> queueNodes, Node node) {
		for(Node nodeQueue : queueNodes) {
			if(compareContent(node, nodeQueue)) {
				return true;
			}
		}
		return false;
	}
	
	public static void printTree(Node node) {
		if(node != null) {
			if(node.getFather() != null) {
				printTree(node.getFather());
			}
		}
		printContent(node.getContent());
	}
	
	public static List<Node> listNode(Node node, List<Node> nodes) {
		List<Node> nodesResult = nodes;
		if(node != null) {
			if(node.getFather() != null) {
				nodesResult.add(node);
				listNode(node.getFather(), nodesResult);
			}
		}
		return nodesResult;
	}
	
	public static Stack<Node> listToStack(List<Node> nodes) {
		Stack<Node> nodesStack = new Stack<>();
		for(Node node : nodes) {
			nodesStack.push(node);
		}
		return nodesStack;
	}
	
	public static void printStates(List<Node> statesFrontier, Node nodeState, List<Node> childrens) {
		System.out.println(">>> Fronteira de estados");
		for(Node node : statesFrontier) {
			for(int i = 0; i < node.getContent().length; i++) {
				if(NodeUtils.compareContent(node, nodeState) || childrens.contains(node)) {
					System.err.print(node.getContent()[0][i] + " ");
				} else {
					System.out.print(node.getContent()[0][i] + " ");
				}
				if(i == (node.getContent().length - 1)) {
					System.out.print("    ");
				}
			}
		}
		System.out.println();
		for(Node node : statesFrontier) {
			for(int i = 0; i < node.getContent().length; i++) {
				if(NodeUtils.compareContent(node, nodeState) || childrens.contains(node)) {
					System.err.print(node.getContent()[1][i] + " ");
				} else {
					System.out.print(node.getContent()[1][i] + " ");
				}
				if(i == (node.getContent().length - 1)) {
					System.out.print("    ");
				}
			}
		}
		System.out.println();
		for(Node node : statesFrontier) {
			for(int i = 0; i < node.getContent().length; i++) {
				if(NodeUtils.compareContent(node, nodeState) || childrens.contains(node)) {
					System.err.print(node.getContent()[2][i] + " ");
				} else {
					System.out.print(node.getContent()[2][i] + " ");
				}
				if(i == (node.getContent().length - 1)) {
					System.out.print("    ");
				}
			}
		}
		System.out.println();
	}
}