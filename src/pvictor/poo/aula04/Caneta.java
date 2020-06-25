package pvictor.poo.aula04;


public class Caneta {

    public String modelo;
    private float ponta;
    private String cor;
    protected int carga;
    private boolean tampada;

    // clicando alt + insert para gerar o constructor
    // clicando ctrl 3 no eclipse e digitando gcuf vai criar o construtor
    public Caneta(String modelo, String cor,float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.carga = carga;
        this.ponta = ponta;


    }

    // clicando alt + insert para gerar os getters e setters no netbeans
    // clicando ctrl 3 no eclipse e digitando ggas vai criar os metodos getters e setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada = true;// aqui da pra mudar se a caneta vai esta tampada ou destampada
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status() {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());//pode usar o this.modelo tambem
        System.out.println("Ponta: " + this.getPonta()); // pode usar o this.ponta tambem
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada? " + this.isTampada());
        System.out.println("");
    }

//    Aqui foram digitados todos os comandos.
//    /* constructor simples sem parametros
//    public Caneta(){
//        this.tampar();
//        this.cor = "Azul";
//    } */
//
//    /*
//        Constructor com parametros
//        m = modelo, c= cor, p = ponta
//    */
//    public Caneta(String m, String c, float p){
//        this.modelo = m;
//        this.cor = c;
//        this.ponta = p;
//        this.tampar();
//    }
//
//    public String getModelo() {
//        return this.modelo;
//    }
//
//    public void setModelo(String m) {
//        this.modelo = m;
//    }
//
//    public float getPonta() {
//        return this.ponta;
//    }
//
//    public void setPonta(float p) {
//        this.ponta = p;
//    }
//
//    public void tampar() {
//        this.tampada = true;
//    }
//
//    public void destampar() {
//        this.tampada = false;
//    }
//
//    public void status() {
//        System.out.println("SOBRE A CANETA: ");
//        System.out.println("Modelo: " + this.getModelo());//pode usar o this.modelo tambem
//        System.out.println("Ponta: " + this.getPonta()); // pode usar o this.ponta tambem
//        System.out.println("Cor: " + this.cor);
//        System.out.println("Tampada? " + this.tampada);
//    }
}


