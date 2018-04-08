package executable;

import model.Node;
import model.NodeJogo8;

public class Jogo8 {

	public static void main(String[] args) {
		int matriz[][] = {{1,2,3},{4,5,6},{0,7,8}}; 
		Node node = new NodeJogo8(matriz, null);
		//System.out.println("Solução em Largura");
		//node.breadthFirstSearch();
		//System.out.println("-----------------------");
		System.out.println("Solução em Profundidade");
		node.depthFirstSearch();
		System.out.println("-----------------------");
	}
}