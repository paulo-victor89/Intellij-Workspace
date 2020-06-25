package pvictor.poo.aula03;


public class Caneta {

    // Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    // Metodos
    public void status() {
        System.out.println("-------Informações da Caneta!-----------");
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga + " % ");
        System.out.println("Está tampada? " + this.tampada);

    }
    public void rabiscar() {
        if(this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        }else {
            System.out.println("Estou rabiscando!");
        }

    }

    public void tampar() {
        this.tampada = true;

    }

    public void destampar() {
        this.tampada = false;

    }
}
