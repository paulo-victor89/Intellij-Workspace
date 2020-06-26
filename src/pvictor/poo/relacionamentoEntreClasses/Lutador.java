package pvictor.poo.relacionamentoEntreClasses;

import javax.swing.*;

public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


//    // Contructor vazio pode ser utilizado caso queria que a msg apareca em uma tela
//    public Lutador(){
//
//    }
//    //Construtor com parametros
        // As informações serão apresentadas no console
    public Lutador(String no, String na, int id, float al, float pe, int vi,
                   int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;

    }
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso<52.2){
            this.categoria = "Inválido";
        }else if(this.peso<=70.3){
            this.categoria = "Leve";
        }else if(this.peso<=83.9){
            this.categoria = "Médio";
        }else if (this.peso<=120.2){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //Métodos publicos
    public void apresentar(){
//       //Caso queira uma tela com a apresetação
//        String mensagem = "Chegou a hora, "+ "\n";
//        mensagem +="vamos apresentar o lutador ..." + "\n";
//        mensagem += "Nome:  " + this.getNome()+ "\n";
//        mensagem += "Diretamente de(a) " + this.getNacionalidade() + "\n";
//        mensagem += "Com " + this.getIdade() + " anos "+"\n";
//        mensagem += "Medindo "+this.getAltura()+ " m de altura" + "\n";
//        mensagem += "Pesando " + this.getPeso() + " Kg" + "\n";
//        mensagem += this.getVitorias() + " vitorias" + "\n";
//        mensagem += this.getDerrotas()+ " derrotas e " + "\n";
//        mensagem += this.getEmpates()+ " empates" + "\n";
//        JOptionPane.showMessageDialog(null, mensagem);

        // no console fazer assim
        System.out.println("--------------------------------------------------");
        System.out.println("Chegou a hora vamos apresentar o lutador ...");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Diretamente de(a)" + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos ");
        System.out.println("Medindo "+this.getAltura()+ " m de altura");
        System.out.println("Pesando " + this.getPeso() + " Kg");
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas()+ " derrotas e ");
        System.out.println(this.getEmpates()+ " empates");


    }
    public void Status(){
        System.out.println(this.getNome()+ " é um peso "+this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() +  " vezes");
        System.out.println("Perdeu " + this.getDerrotas() +  " vezes");
        System.out.println("Empatou "+ this.getEmpates()  +  " vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }


}
