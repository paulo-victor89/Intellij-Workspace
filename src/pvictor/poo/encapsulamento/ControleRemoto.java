package pvictor.poo.encapsulamento;


public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos especiais
    // Constructor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //Getters e Setters
    // Para booleanos pode trocar o is pelo get
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        /*
            Implementar um if para so mostrar o menu se estiver ligado
         */
        if(this.getLigado()){
        System.out.println("-----Menu-----");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 1; i <= this.getVolume(); i += 10) {
            System.out.print(" | ");
        }
        System.out.println("");
    }else if (!(this.getLigado())){
            System.out.println("Erro: O controle está desligado!");
        }
    }

    @Override
    public void fecharMenu() {
        //System.out.println("Fechando Menu...");
        if(!(this.getLigado())){
            System.out.println("Erro: o controle está desligado");
        }
        else if(!(this.getLigado())){
            System.out.println("Fechando Menu...");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }else if (!(this.getLigado())){
            System.out.println("Erro: O controle está desligado");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }else if(!(this.getLigado())){
            System.out.println("Erro: O controle está desligado");
        }

    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
            //this.setTocando(false);
        }else if(this.getLigado()&& this.getVolume()==0){
            System.out.println("Erro: O volume já está no mudo");
        }else if(!(this.getLigado())){
            System.out.println("Erro: O controle está desligado");
        }

    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }else if (this.getVolume()>0 && this.getLigado()){
            System.out.println("Aviso: O volume não está no mudo");
        }else if(!(this.getLigado())){
            System.out.println("Erro: O controle está desligado");
        }

    }

    @Override
    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
        else if(this.getLigado() && this.getTocando()){
            System.out.println("Aviso: o sistema já está no modo play");
        }
        else if(!(this.getLigado())){
            System.out.println("Erro: o controle está desligado");
        }
    }


    @Override

    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
        else if(this.getLigado() && !(this.getTocando())){
            System.out.println("Aviso: o sistema já está no modo pause");
        }
        else if(!(this.getLigado())){
            System.out.println("Erro: o controle está desligado");
        }
    }


}
