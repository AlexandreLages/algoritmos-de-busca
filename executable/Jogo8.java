package executable;

import model.Node;
import model.NodeJogo8;
import utils.NodeUtils;

public class Jogo8 {

	public static void main(String[] args) {
		int matriz[][] = {{1,2,3},{4,5,6},{7,0,8}}; 
		Node node = new NodeJogo8(matriz, null);
		NodeUtils.printContent(node.getContent());
		if(node.expandNode().size() > 0) {
			for(Node expanded : node.expandNode()) {
				NodeUtils.printContent(expanded.getContent());
			}
		}
	}
}