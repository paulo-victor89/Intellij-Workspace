package pvictor.poo.herança11;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando a bolsa de " +this.nome);

    }
    @Override //sobreposição do metodo
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsista{" +
                "bolsa=" + bolsa +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
