package pvictor.poo.aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(102030);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.getTipo();

        p1.sacar(150);
        p1.pagarMensal();
        //p1.fecharConta();

        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(405060);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        p2.pagarMensal();


        p2.estadoAtual();

    }

}
