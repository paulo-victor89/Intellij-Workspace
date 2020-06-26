package pvictor.poo.praticas;

import javax.swing.*;
public class Pratica01 {

    public String nome;
    public int idade;
    public float altura;


    public void inserirDados(){
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));
    }

    public void mostrar(){
        String mensagem = "Dados da pessoa: \n";
        mensagem += "Nome:  " + nome + "\n";
        mensagem += "Idade: " + idade + "\n";
        mensagem += "Altura: " + altura +"\n";
        JOptionPane.showMessageDialog(null, mensagem);
    }

}

