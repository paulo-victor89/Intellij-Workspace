package pvictor.poo.herança11;

public class Tecnico extends Aluno{
    private String registroProfissional;

    public void praticar(){
        System.out.println((super.getSexo().equals("M"))?"O aluno " + super.getNome() + " esta praticando":"A aluna "
                + super.getNome() + " esta praticando " + super.getCurso());
    }
    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "Tecnico{nome=" + super.getNome() + ", idade=" + super.getIdade() + ", sexo=" + super.getSexo() +
                ", matricula=" + super.getMatricula() + ", curso=" + super.getCurso() + ", registro profissional=" + this.registroProfissional + "}";
    }

}
