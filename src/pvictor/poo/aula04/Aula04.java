package pvictor.poo.aula04;
public class Aula04 {

    public static void main(String[] args) {
        //modelo, cor e ponta
        Caneta c1 = new Caneta("NIC","AMARELA",0.4f );
        c1.status();
        //modelo, cor e ponta
        Caneta c2 = new Caneta("KKK","Laranja",1.5f);
        c2.status();

        Cadeira cr1 = new Cadeira("Teste", "Marron");
        cr1.status();

    }



}