package model;

import java.util.List;

public class NodeNRainhas extends Node{

	public NodeNRainhas(int[][] content, Node father, Algorihtm algorihtm) {
		super(content, father, algorihtm);
	}

	@Override
	public List<Node> expandNode() {
		return null;
	}

	@Override
	public boolean verifyContent() {
		return false;
	}
}