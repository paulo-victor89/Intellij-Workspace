package pvictor.poo.aula02;

public class Caneta {

    // Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    // Metodos
    void status() {
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga + " % ");
        System.out.println("Está tampada? " + this.tampada);

    }
    void rabiscar() {
        if(this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        }else {
            System.out.println("Estou rabiscando!");
        }

    }

    void tampar() {
        this.tampada = true;

    }

    void destampar() {
        this.tampada = false;

    }
}
