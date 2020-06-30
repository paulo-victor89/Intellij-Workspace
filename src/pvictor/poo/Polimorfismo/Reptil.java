package pvictor.poo.Polimorfismo;

public class Reptil extends Animal {
    private String corScama;


    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");

    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");

    }

    public String getCorScama() {
        return corScama;
    }

    public void setCorScama(String corScama) {
        this.corScama = corScama;
    }
}
