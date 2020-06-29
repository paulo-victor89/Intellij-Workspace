package pvictor.poo.herança;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p2.setSexo("M");
        p2.setIdade(18);
        p3.setSexo("M");
        p4.setSexo("F");

        // esses pontos serão feito na parte 2 da aula de herança
        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

//        //comandos que apresentam erro
//        p1.receberAumento(550.20f); // p3 e que pode receber aumento
//        p2.mudarTrabalho(); // p4 e que pode mudar trabalho
//        p3.cancelarMatr(); // p2 e que pode cancelar matricula


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());



    }
}
