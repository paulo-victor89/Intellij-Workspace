package pvictor.poo.aula04;


public class Cadeira {
    private String modelo;
    private String cor;
    private boolean empilhada;

    // constructor
    public Cadeira(String modelo, String cor) {
        super();
        this.modelo = modelo;
        this.cor = cor;
    }

    // getters e setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void Empilhada() {
        this.empilhada = true;
    }

    public void Empilhada(boolean empilhada) {
        this.empilhada = false;
    }

    public void status() {
        System.out.println("SOBRE A CADEIRA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " 	 +this.cor);
        System.out.println("Empilhada: "+ this.empilhada);



    }

}
