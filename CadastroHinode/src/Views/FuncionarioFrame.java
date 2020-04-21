package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlers.FuncionarioController;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "unused", "serial" })
public class FuncionarioFrame extends JFrame {

	private JPanel contentPane;
	private JTextField nomeFuncTextField;
	private JTextField matFuncTextField;
	private JLabel lblNewLabel_1;
	private JButton btnSortear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuncionarioFrame frame = new FuncionarioFrame();
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
	public FuncionarioFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nomeFuncTextField = new JTextField();
		nomeFuncTextField.setBounds(124, 43, 173, 20);
		contentPane.add(nomeFuncTextField);
		nomeFuncTextField.setColumns(10);
		
		matFuncTextField = new JTextField();
		matFuncTextField.setBounds(124, 88, 173, 20);
		contentPane.add(matFuncTextField);
		matFuncTextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(47, 46, 44, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Matricula");
		lblNewLabel_1.setBounds(47, 91, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.setBounds(124, 213, 84, 23);
		contentPane.add(btnExibir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(230, 213, 84, 23);
		contentPane.add(btnLimpar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 213, 97, 23);
		contentPane.add(btnCadastrar);
		
		
		JButton btnSortear = new JButton("Sortear");
		btnSortear.setBounds(335, 213, 89, 23);
		contentPane.add(btnSortear);
		
		
		FuncionarioController manipula = new FuncionarioController(nomeFuncTextField,matFuncTextField);
		
	
		btnCadastrar.addActionListener(manipula);
		btnExibir.addActionListener(manipula);
		btnLimpar.addActionListener(manipula);
		btnSortear.addActionListener(manipula);
		
	}
}
