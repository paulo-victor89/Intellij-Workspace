package pvictor.poo.herança11;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;


    public void receberAumento(float aum){
        this.salario += aum;
        System.out.println(super.getNome() +" Recebeu aumento de R$ " + aum );

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
        System.out.println( "O professor " + getNome() + " Tem salario inicial R$ " +getSalario());
    }

    @Override
    public String toString() {
        return "Dados do Professor{\n" +
                ",nome= " +super.getNome() +
                ",idade= " +super.getIdade()+
                ",sexo= " +super.getSexo()+
                "\n,especialidade= '" + especialidade + '\'' +
                ", salario com aumento= R$ " + salario +
                '}';
    }
}
