package model;

import java.util.List;

public abstract class Node {

	private int[][] content;
	private Node father;
	
	public Node(int[][] content, Node father) {
		this.content = content;
		this.father = father;
	}
	
	public abstract List<Node> expandNode();
	public abstract boolean verifyContent();
	
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
