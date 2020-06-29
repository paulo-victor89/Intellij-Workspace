package pvictor.poo.ProjetoLivro;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria",28, "F");

        l[0] = new Livro("Aprendendo java","José da Silva", 300,p[0]);
        l[1] = new Livro("POO para Iniciantes","Pedro Paulo",500, p[1]);
        l[2] = new Livro("Java Avancado","Maria Candido",800,p[0]);

        l[0].abrir();
        l[0].folhear(299);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());

        System.out.println(l[1].detalhes());

    }

}
