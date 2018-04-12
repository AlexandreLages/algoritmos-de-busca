package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import model.Node;
import model.NodeJogo8;
import utils.NodeUtils;

@SuppressWarnings("serial")
public class Board extends JFrame {

	JButton[][] nodes = new JButton[3][3];
	
	private JPanel contentPane;
	private Node nodeResult;
	private List<Node> nodesResult;
	private List<Node> nodesTree;
	private Stack<Node> nodesStack;
	private JPanel panel;
	private JButton buttonBreadthSearch;
	private JButton buttonDepthSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board frame = new Board();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Board() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Jogo dos 8");
		setBounds(100, 100, 521, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setBounds(50, 12, 218, 218);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton node_0_0 = new JButton();
		nodes[0][0] = node_0_0;
		nodes[0][0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(nodes[0][0])) {
					move(nodes[0][0]);
					nodes[0][0].setVisible(false);
				}
			}
		});
		
		nodes[0][0].setText("1");
		nodes[0][0].setFont(new Font("Dialog", Font.PLAIN, 25));
		nodes[0][0].setBackground(new Color(135, 206, 235));
		nodes[0][0].setForeground(new Color(255, 255, 255));
		nodes[0][0].setBounds(2, 2, 70, 70);
		panel.add(nodes[0][0]);
		
		JButton node_0_1 = new JButton();
		nodes[0][1] = node_0_1;
		nodes[0][1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(nodes[0][1])) {
					move(nodes[0][1]);
					nodes[0][1].setVisible(false);
				}
			}
		});
		
		nodes[0][1].setText("2");
		nodes[0][1].setFont(new Font("Dialog", Font.PLAIN, 25));
		nodes[0][1].setBackground(new Color(135, 206, 235));
		nodes[0][1].setForeground(new Color(255, 255, 255));
		nodes[0][1].setBounds(74, 2, 70, 70);
		panel.add(nodes[0][1]);
		
		JButton node_0_2 = new JButton();
		nodes[0][2] = node_0_2;
		nodes[0][2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(nodes[0][2])) {
					move(nodes[0][2]);
					nodes[0][2].setVisible(false);
				}
			}
		});
		
		nodes[0][2].setText("3");
		nodes[0][2].setFont(new Font("Dialog", Font.PLAIN, 25));
		nodes[0][2].setBackground(new Color(135, 206, 235));
		nodes[0][2].setForeground(new Color(255, 255, 255));
		nodes[0][2].setBounds(146, 2, 70, 70);
		panel.add(nodes[0][2]);
		
		JButton node_1_0 = new JButton();
		nodes[1][0] = node_1_0;
		nodes[1][0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(nodes[1][0])) {
					move(nodes[1][0]);
					nodes[1][0].setVisible(false);
				}
			}
		});
		nodes[1][0].setText("4");
		nodes[1][0].setBackground(new Color(135, 206, 235));
		nodes[1][0].setFont(new Font("Dialog", Font.PLAIN, 25));
		nodes[1][0].setForeground(new Color(255, 255, 255));
		nodes[1][0].setBounds(2, 74, 70, 70);
		panel.add(nodes[1][0]);
		
		JButton node_1_1 = new JButton();
		nodes[1][1] = node_1_1;
		nodes[1][1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(nodes[1][1])) {
					move(nodes[1][1]);
					nodes[1][1].setVisible(false);
				}
			}
		});
		nodes[1][1].setText("5");
		nodes[1][1].setFont(new Font("Dialog", Font.PLAIN, 25));
		nodes[1][1].setBackground(new Color(135, 206, 235));
		nodes[1][1].setForeground(new Color(255, 255, 255));
		nodes[1][1].setBounds(74, 74, 70, 70);
		panel.add(nodes[1][1]);
		
		JButton node_1_2 = new JButton();
		nodes[1][2] = node_1_2;
		nodes[1][2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(nodes[1][2])) {
					move(nodes[1][2]);
					nodes[1][2].setVisible(false);
				}
			}
		});
		nodes[1][2].setText("6");
		nodes[1][2].setFont(new Font("Dialog", Font.PLAIN, 25));
		nodes[1][2].setBackground(new Color(135, 206, 235));
		nodes[1][2].setForeground(new Color(255, 255, 255));
		nodes[1][2].setBounds(146, 74, 70, 70);
		panel.add(nodes[1][2]);
		
		JButton node_2_0 = new JButton();
		nodes[2][0] = node_2_0;
		nodes[2][0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(nodes[2][0])) {
					move(nodes[2][0]);
					nodes[2][0].setVisible(false);
				}
			}
		});
		nodes[2][0].setText("7");
		nodes[2][0].setFont(new Font("Dialog", Font.PLAIN, 25));
		nodes[2][0].setBackground(new Color(135, 206, 235));
		nodes[2][0].setForeground(new Color(255, 255, 255));
		nodes[2][0].setBounds(2, 146, 70, 70);
		panel.add(nodes[2][0]);
		
		JButton node_2_1 = new JButton();
		nodes[2][1] = node_2_1;
		nodes[2][1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(nodes[2][1])) {
					move(nodes[2][1]);
					nodes[2][1].setVisible(false);
				}
			}
		});
		nodes[2][1].setText("8");
		nodes[2][1].setFont(new Font("Dialog", Font.PLAIN, 25));
		nodes[2][1].setBackground(new Color(135, 206, 235));
		nodes[2][1].setForeground(new Color(255, 255, 255));
		nodes[2][1].setBounds(74, 146, 70, 70);
		panel.add(nodes[2][1]);
		
		JButton node_2_2 = new JButton();
		nodes[2][2] = node_2_2;
		nodes[2][2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(nodes[2][2])) {
					move(nodes[2][2]);
					nodes[2][2].setVisible(false);
				}
			}
		});
		nodes[2][2].setText("0");
		nodes[2][2].setFont(new Font("Dialog", Font.PLAIN, 25));
		nodes[2][2].setBackground(new Color(135, 206, 235));
		nodes[2][2].setForeground(new Color(255, 255, 255));
		nodes[2][2].setBounds(146, 146, 70, 70);
		nodes[2][2].setVisible(false);
		panel.add(nodes[2][2]);
		
		buttonBreadthSearch = new JButton("Busca Em Largura");
		buttonBreadthSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[][] matriz = new int[3][3];
				createMatriz(matriz);
				Node nodeInit = new NodeJogo8(matriz, null);
				nodeResult = nodeInit.breadthFirstSearch();
				nodesResult = new ArrayList<>();
				new Thread(threadResult).start();
			}
		});
		buttonBreadthSearch.setFont(new Font("Dialog", Font.PLAIN, 14));
		buttonBreadthSearch.setForeground(new Color(255, 255, 255));
		buttonBreadthSearch.setBackground(new Color(169, 169, 169));
		buttonBreadthSearch.setBounds(280, 12, 218, 27);
		contentPane.add(buttonBreadthSearch);
		
		buttonDepthSearch = new JButton("Busca Em Profundidade");
		buttonDepthSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[][] matriz = new int[3][3];
				createMatriz(matriz);
				Node nodeInit = new NodeJogo8(matriz, null);
				nodeResult = nodeInit.depthFirstSearch();
				nodesResult = new ArrayList<>();
				new Thread(threadResult).start();
			}
		});
		buttonDepthSearch.setFont(new Font("Dialog", Font.PLAIN, 14));
		buttonDepthSearch.setForeground(new Color(255, 255, 255));
		buttonDepthSearch.setBackground(new Color(169, 169, 169));
		buttonDepthSearch.setBounds(280, 45, 218, 27);
		contentPane.add(buttonDepthSearch);
	}
	
	public List<JButton> verifyMoviment() {
		List<JButton> buttons = new ArrayList<JButton>();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(nodes[i][j].getText().equals("0")) {
					if(i > 0) {
						buttons.add(nodes[i - 1][j]);
					}
					
					if(i < 2) {
						buttons.add(nodes[i + 1][j]);
					}
					
					if(j > 0) {
						buttons.add(nodes[i][j - 1]);
					}
					
					if(j < 2) {
						buttons.add(nodes[i][j + 1]);
					}
				}
			}
		}
		return buttons;
	}
	
	public void move(JButton button) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(nodes[i][j].getText().equals("0")) {
					nodes[i][j].setText(button.getText());
					button.setText("0");
					nodes[i][j].setVisible(true);
				}
			}
		}
	}
	
	private Runnable threadResult = new Runnable() {
		public void run() {
			if(nodeResult != null) {
				buttonBreadthSearch.setEnabled(false);
				buttonDepthSearch.setEnabled(false);
				if(verifyMatriz()) {
					buttonBreadthSearch.setEnabled(true);
					buttonDepthSearch.setEnabled(true);
					JOptionPane.showMessageDialog(contentPane, "Passe um tabuleiro ainda não resolvido!", "Tabuleiro Resolvido", JOptionPane.WARNING_MESSAGE);
				}
				try {
					nodesTree = NodeUtils.listNode(nodeResult, nodesResult);
					nodesStack = NodeUtils.listToStack(nodesTree);
					do {
						Node node = nodesStack.pop();
						NodeUtils.printContent(node.getContent());
						int iContent = 0;
						int iBoard = 0;
						int jContent = 0;
						int jBoard = 0;
						for(int i = 0; i < 3; i++) {
							for(int j = 0; j < 3; j++) {
								if(nodes[i][j].getText().equals("0")) {
									iBoard = i;
									jBoard = j;
								}
								if(node.getContent()[i][j] == 0) {
									iContent = i;
									jContent = j;
								}
							}
						}
						nodes[iBoard][jBoard].setText(nodes[iContent][jContent].getText());
						nodes[iBoard][jBoard].setVisible(true);
						nodes[iContent][jContent].setText("0");
						nodes[iContent][jContent].setVisible(false);
						panel.revalidate();
						panel.repaint();
						Thread.sleep(500);
					} while(!nodesStack.isEmpty());
					if(verifyMatriz()) {
						buttonBreadthSearch.setEnabled(true);
						buttonDepthSearch.setEnabled(true);
						JOptionPane.showMessageDialog(contentPane, "O tabuleiro foi resolvido!", "Tabuleiro Resolvido", JOptionPane.INFORMATION_MESSAGE);
					}
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	
	private void createMatriz(int[][] matriz) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = Integer.parseInt(nodes[i][j].getText());
			}
		}
	}
	
	private boolean verifyMatriz() {
		int[][] matriz = {{1,2,3},{4,5,6},{7,8,0}};
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(!nodes[i][j].getText().equals("" + matriz[i][j])) {
					return false;
				}
			}
		}
		return true;
	}
}