package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Algorihtm;
import model.Node;

@SuppressWarnings("serial")
public class Report extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Report(Node node) {
		setTitle("Resultados da Busca");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBusca = new JLabel();
		if(node.getAlgorihtm() == Algorihtm.LARGURA) {
			lblBusca.setText("Resultados da Busca em Largura");
		} else if(node.getAlgorihtm() == Algorihtm.PROFUNDIDADE) {
			lblBusca.setText("Resultados da Busca em Profundidade");
		} else {
			lblBusca.setText("Resultados da Busca A-Estrela");
		}
		lblBusca.setBounds(12, 12, 300, 17);
		contentPane.add(lblBusca);
	}
}
