package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Models.Funcionario;

public class FuncionarioController implements ActionListener {
	
	private JTextField textNome;
	private JTextField textMatricula;
	private Funcionario lerFuncionario;
	
	ArrayList<Funcionario> LerFuncionario = new ArrayList();
    Random num = new Random();
	
	
	public FuncionarioController(JTextField textNome, JTextField textMatricula) {
		this.textNome = textNome;
		this.textMatricula = textMatricula;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent event) {

		switch (event.getActionCommand()) {
		
		case "Exibir" : if (lerFuncionario == null){
							JOptionPane.showMessageDialog(null, "NENHUM REGISTRO ENCONTRADO");
        }
        				else{
        					this.exibirFuncionario();
        				} 
			break;
		case "Limpar": this.LimparFormulario();
			break;
		case "Cadastrar" : this.cadastrarFuncionario();
			break;
		case "Sortear" : if(lerFuncionario.size()<= 2){
            				JOptionPane.showMessageDialog(null,"NÃO POSSUI FUNCIONARIOS SUFICIENTE CADASTRADOS");
						 }
        				else{
        					JOptionPane.showMessageDialog(null,lerFuncionario.get(num.nextInt(lerFuncionario.size())).toString());
        				 }
        	break;
			
			this.sortearFuncionario();	
		
		}
	}
	
	private void exibirFuncionario(){
		System.out.println("Exibir Funcionario");
		this.textNome.setText(lerFuncionario.getNome());
		this.textMatricula.setText(lerFuncionario.getMatricula());
	}
	
	private void LimparFormulario(){
		System.out.println("limpar Formulário");
		textNome.setText("");
		textMatricula.setText("");
	}
	
	private void cadastrarFuncionario(){
		System.out.println("Cadastrar Formulário");
		lerFuncionario = new Funcionario(
				textNome.getText() , 
				Integer.parseInt(textMatricula.getText())); // parseInt converte String para Inteiro
	}
	
	private void sortearFuncionario() {
		System.out.println("Sortear Funcionário");
		
	}
}
