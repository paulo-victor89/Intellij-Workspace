package pvictor.poo.ProjetoFinal;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAsssitido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAsssitido = 0;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAsssitido() {
        return totAsssitido;
    }

    public void setTotAsssitido(int totAsssitido) {
        this.totAsssitido = totAsssitido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{\n" + super.toString() +
                "\nlogin='" + login + '\'' +
                "\n,totAsssitido=" + totAsssitido +
                '}';
    }
}
