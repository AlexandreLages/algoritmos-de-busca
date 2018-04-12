package executable;

import model.Algorihtm;
import model.Node;
import model.NodeJogo8;

public class Jogo8 {

	public static void main(String[] args) {
		int matriz[][] = {{1,2,3},{4,5,6},{0,7,8}}; 
		Node node = new NodeJogo8(matriz, null, Algorihtm.PROFUNDIDADE);
		node.depthFirstSearch();
	}
}