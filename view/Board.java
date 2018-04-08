package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import model.Node;
import model.NodeJogo8;
import utils.NodeUtils;

@SuppressWarnings("serial")
public class Board extends JFrame {

	private JPanel contentPane;
	JButton[][] nodes = new JButton[3][3];

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
		setBounds(100, 100, 318, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setBounds(50, 12, 218, 218);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton node_0_0 = new JButton();
		node_0_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(node_0_0)) {
					move(node_0_0);
					node_0_0.setVisible(false);
				}
			}
		});
		
		node_0_0.setText("1");
		node_0_0.setFont(new Font("Dialog", Font.PLAIN, 25));
		node_0_0.setBackground(new Color(135, 206, 235));
		node_0_0.setForeground(new Color(255, 255, 255));
		node_0_0.setBounds(2, 2, 70, 70);
		nodes[0][0] = node_0_0;
		panel.add(nodes[0][0]);
		
		JButton node_0_1 = new JButton();
		node_0_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(node_0_1)) {
					move(node_0_1);
					node_0_1.setVisible(false);
				}
			}
		});
		
		node_0_1.setText("2");
		node_0_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		node_0_1.setBackground(new Color(135, 206, 235));
		node_0_1.setForeground(new Color(255, 255, 255));
		node_0_1.setBounds(74, 2, 70, 70);
		nodes[0][1] = node_0_1;
		panel.add(nodes[0][1]);
		
		JButton node_0_2 = new JButton();
		node_0_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(node_0_2)) {
					move(node_0_2);
					node_0_2.setVisible(false);
				}
			}
		});
		
		node_0_2.setText("3");
		node_0_2.setFont(new Font("Dialog", Font.PLAIN, 25));
		node_0_2.setBackground(new Color(135, 206, 235));
		node_0_2.setForeground(new Color(255, 255, 255));
		node_0_2.setBounds(146, 2, 70, 70);
		nodes[0][2] = node_0_2;
		panel.add(nodes[0][2]);
		
		JButton node_1_0 = new JButton();
		node_1_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(node_1_0)) {
					move(node_1_0);
					node_1_0.setVisible(false);
				}
			}
		});
		node_1_0.setText("4");
		node_1_0.setBackground(new Color(135, 206, 235));
		node_1_0.setFont(new Font("Dialog", Font.PLAIN, 25));
		node_1_0.setForeground(new Color(255, 255, 255));
		node_1_0.setBounds(2, 74, 70, 70);
		nodes[1][0] = node_1_0;
		panel.add(nodes[1][0]);
		
		JButton node_1_1 = new JButton();
		node_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(node_1_1)) {
					move(node_1_1);
					node_1_1.setVisible(false);
				}
			}
		});
		
		node_1_1.setText("5");
		node_1_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		node_1_1.setBackground(new Color(135, 206, 235));
		node_1_1.setForeground(new Color(255, 255, 255));
		node_1_1.setBounds(74, 74, 70, 70);
		nodes[1][1] = node_1_1;
		panel.add(nodes[1][1]);
		
		JButton node_1_2 = new JButton();
		node_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(node_1_2)) {
					move(node_1_2);
					node_1_2.setVisible(false);
				}
			}
		});
		
		node_1_2.setText("6");
		node_1_2.setFont(new Font("Dialog", Font.PLAIN, 25));
		node_1_2.setBackground(new Color(135, 206, 235));
		node_1_2.setForeground(new Color(255, 255, 255));
		node_1_2.setBounds(146, 74, 70, 70);
		nodes[1][2] = node_1_2;
		panel.add(nodes[1][2]);
		
		JButton node_2_0 = new JButton();
		node_2_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(node_2_0)) {
					move(node_2_0);
					node_2_0.setVisible(false);
				}
			}
		});
		
		node_2_0.setText("7");
		node_2_0.setFont(new Font("Dialog", Font.PLAIN, 25));
		node_2_0.setBackground(new Color(135, 206, 235));
		node_2_0.setForeground(new Color(255, 255, 255));
		node_2_0.setBounds(2, 146, 70, 70);
		nodes[2][0] = node_2_0;
		panel.add(nodes[2][0]);
		
		JButton node_2_1 = new JButton();
		node_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(node_2_1)) {
					move(node_2_1);
					node_2_1.setVisible(false);
				}
			}
		});
		
		node_2_1.setText("8");
		node_2_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		node_2_1.setBackground(new Color(135, 206, 235));
		node_2_1.setForeground(new Color(255, 255, 255));
		node_2_1.setBounds(74, 146, 70, 70);
		nodes[2][1] = node_2_1;
		panel.add(nodes[2][1]);
		
		JButton node_2_2 = new JButton();
		node_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<JButton> buttons = verifyMoviment();
				if(buttons.contains(node_2_2)) {
					move(node_2_2);
					node_2_2.setVisible(false);
				}
			}
		});
		
		node_2_2.setText("0");
		node_2_2.setFont(new Font("Dialog", Font.PLAIN, 25));
		node_2_2.setBackground(new Color(135, 206, 235));
		node_2_2.setForeground(new Color(255, 255, 255));
		node_2_2.setBounds(146, 146, 70, 70);
		node_2_2.setVisible(false);
		nodes[2][2] = node_2_2;
		panel.add(nodes[2][2]);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[][] matriz = new int[3][3];
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						matriz[i][j] = Integer.parseInt(nodes[i][j].getText());
					}
				}
				Node nodeInit = new NodeJogo8(matriz, null);
				Node result = nodeInit.breadthFirstSearch();
				NodeUtils.printTree(result);
			}
		});
		btnIniciar.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnIniciar.setForeground(new Color(255, 255, 255));
		btnIniciar.setBackground(new Color(169, 169, 169));
		btnIniciar.setBounds(50, 240, 218, 27);
		contentPane.add(btnIniciar);
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
}
