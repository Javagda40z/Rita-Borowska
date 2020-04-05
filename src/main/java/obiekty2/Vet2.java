package obiekty2;

import obiekty.Cat;
import obiekty.Dog;
import obiekty.Vet;

public class Vet2 {

    public void sayHello(Animal2 zwierze) {
        System.out.println("Witaj" + zwierze.getImie());

    }

    public static void main(String[] args) {

        Animal2 kot = new Cat2("Filemon");
        Animal2 pies = new Dog2("Burek");

        Vet2 weterynarz = new Vet2();
        weterynarz.sayHello(kot);
        weterynarz.sayHello(pies);

        Animal2 chomik = new Hamster("homik");
        weterynarz.sayHello(chomik);
    }


}
