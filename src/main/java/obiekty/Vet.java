package obiekty;

import obiekty2.Animal2;
import obiekty2.Hamster;

public class Vet {

    public void sayHello(Cat cat) {
        System.out.println("Witaj" + cat.getImie());

    }
    public void sayHello(Dog dog) {
        System.out.println("Witaj" + dog.getImie());
    }

    public static void main(String[] args) {
        Cat kot = new Cat("Filemon");
        Dog pies = new Dog("Burek");
        Vet weterynarz = new Vet();
        weterynarz.sayHello(kot);
        weterynarz.sayHello(pies);



    }


}
