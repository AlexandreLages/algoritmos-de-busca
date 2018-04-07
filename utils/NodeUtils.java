package utils;

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
}