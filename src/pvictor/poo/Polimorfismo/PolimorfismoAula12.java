package pvictor.poo.Polimorfismo;

public class PolimorfismoAula12 {
    public static void main(String[] args) {
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru can = new Canguru();
        Cachorro dog = new Cachorro();
        Cobra snake = new Cobra();
        Tartaruga tar = new Tartaruga();
        Goldfish gold = new Goldfish();
        Arara ara = new Arara();

//        m.setPeso(35.3f);
//        m.setCorPelo("Marrom");
//        m.alimentar();
//        m.locomover();
//        m.emitirSom();

//        a.locomover();
//        p.locomover();
//        r.locomover();
        can.locomover();
        dog.locomover();
        can.emitirSom();
        dog.emitirSom();
    }

}
