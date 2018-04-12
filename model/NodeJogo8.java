package model;

import java.util.ArrayList;
import java.util.List;

import utils.NodeUtils;

public class NodeJogo8 extends Node{

	public NodeJogo8(int[][] content, Node father, Algorihtm algorihtm) {
		super(content, father, algorihtm);
	}

	@Override
	public List<Node> expandNode() {
		int order = this.getContent().length;
		List<Node> expandedNodes = new ArrayList<Node>();
		for(int i = 0; i < order; i++) {
			for(int j = 0; j < order; j++) {
				if(this.getContent()[i][j] == 0) {
					if(i > 0) {
						int[][] childContent = NodeUtils.copyContente(this.getContent());
						childContent[i][j] = childContent[i - 1][j];
						childContent[i - 1][j] = 0;
						Node child = new NodeJogo8(childContent, this, this.getAlgorihtm());
						expandedNodes.add(child);
					}
					
					if(i < (order - 1)) {
						int[][] childContent = NodeUtils.copyContente(this.getContent());
						childContent[i][j] = childContent[i + 1][j];
						childContent[i + 1][j] = 0;
						Node child = new NodeJogo8(childContent, this, this.getAlgorihtm());
						expandedNodes.add(child);
					}
					
					if(j > 0) {
						int[][] childContent = NodeUtils.copyContente(this.getContent());
						childContent[i][j] = childContent[i][j - 1];
						childContent[i][j - 1] = 0;
						Node child = new NodeJogo8(childContent, this, this.getAlgorihtm());
						expandedNodes.add(child);
					}
					
					if(j < (order - 1)) {
						int[][] childContent = NodeUtils.copyContente(this.getContent());
						childContent[i][j] = childContent[i][j + 1];
						childContent[i][j + 1] = 0;
						Node child = new NodeJogo8(childContent, this, this.getAlgorihtm());
						expandedNodes.add(child);
					}
				}
			}
		}
		return expandedNodes;
	}
	
	public boolean verifyContent() {
		int[][] contentResult = {{1,2,3},{4,5,6},{7,8,0}};
		for(int i = 0; i < this.getContent().length; i++) {
			for(int j = 0; j < this.getContent().length; j++) {
				if(this.getContent()[i][j] != contentResult[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}