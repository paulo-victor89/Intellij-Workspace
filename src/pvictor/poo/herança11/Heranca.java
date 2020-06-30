package pvictor.poo.herança11;

public class Heranca {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
//        Visitante v1 = new Visitante();
//        v1.setNome("Juvenal");
//        v1.setIdade(22);
//        v1.setSexo("Masculino");
//        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
//        a1.setMatricula(1111);
//        a1.setCurso("Informatica");
//        a1.setIdade(16);
//        a1.setSexo("Masculino");
//        System.out.println(a1.toString());
//        a1.pagarMensalidade();
//
//        Bolsista b1 = new Bolsista();
//        b1.setMatricula(1120);
//        b1.setNome("Jubiscleison");
//        b1.setBolsa(12.5f);
//        b1.setSexo("M");
//        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setNome("Jonas");
        p1.setSalario(500f);
        p1.setEspecialidade("Computação");
        p1.receberAumento(500f);
        System.out.println(p1.toString());
//        Tecnico t1 = new Tecnico();
//        t1.setNome("Jonas");
//        t1.setIdade(33);
//        t1.setSexo("M");
//        t1.setCurso("Computacao");
//        t1.setRegistroProfissional("teste");
//        t1.praticar();
//        System.out.println(t1.toString());


    }
}
