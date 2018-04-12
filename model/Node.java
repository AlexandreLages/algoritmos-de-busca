package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import utils.NodeUtils;

public abstract class Node {

	private int[][] content;
	private Node father;
	
	public Node(int[][] content, Node father) {
		this.content = content;
		this.father = father;
	}
	
	public abstract List<Node> expandNode();
	public abstract boolean verifyContent();
	
	public Node breadthFirstSearch() {
		List<Node> statesFrontier = new ArrayList<Node>();	
		statesFrontier.add(this);
		Queue<Node> queueNodes = new LinkedList<>();
		queueNodes.add(this);
		while(!queueNodes.isEmpty()) {
			Node nodeHead = queueNodes.element();
			if(nodeHead.verifyContent()) {
				return nodeHead;
			}
			List<Node> childrens = nodeHead.expandNode();
			for(Node node : childrens) {
				if(!NodeUtils.queueContainsNode(statesFrontier, node)) {
					queueNodes.add(node);
					statesFrontier.add(node);
				}
			}
			queueNodes.poll();
		}
		return null;
	}
	
	public Node depthFirstSearch() {
		List<Node> statesFrontier = new ArrayList<Node>();
		statesFrontier.add(this);
		Stack<Node> stackNodes = new Stack<Node>();
		stackNodes.add(this);
		while(!stackNodes.isEmpty()) {
			Node nodeHead = stackNodes.pop();
			if(nodeHead.verifyContent()) {
				return nodeHead;
			}
			List<Node> childrens = nodeHead.expandNode();
			for(Node node : childrens) {
				if(!NodeUtils.queueContainsNode(statesFrontier, node)) {
					stackNodes.add(node);
					statesFrontier.add(node);
				}
			}
		}
		return null;
	}
	
	public Node bestFirstSearch() {
		List<Node> statesFrontier = new ArrayList<Node>();
		statesFrontier.add(this);
		Stack<Node> stackNodes = new Stack<Node>();
		stackNodes.add(this);
		while(!stackNodes.isEmpty()) {
			Node nodeHead = stackNodes.pop();
			if(nodeHead.verifyContent()) {
				return nodeHead;
			}
			List<Node> childrens = nodeHead.expandNode();
			for(Node node : childrens) {
				if(!NodeUtils.queueContainsNode(statesFrontier, node)) {
					stackNodes.add(node);
					statesFrontier.add(node);
				}
			}
		}
		return null;
	}
	
	public int[][] getContent() {
		return content;
	}
	
	public void setContent(int[][] content) {
		this.content = content;
	}
	
	public Node getFather() {
		return father;
	}
	
	public void setFather(Node father) {
		this.father = father;
	}
}
