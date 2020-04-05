package obiekty;

import java.util.ArrayList;
import java.util.List;

public class PracaTestowa {

    public static void main(String[] args) {

        Animal zwierzeta[] = new Animal[5];
        List<Animal> listaZwierzat = new ArrayList<>();

        zwierzeta[0] = new Cat();
        zwierzeta[1] = new Cat();
        zwierzeta[2] = new Cow();
        zwierzeta[3] = new Dog();
        zwierzeta[4] = new Dog();

        listaZwierzat.add(new Dog());
        listaZwierzat.add(new Dog());
        listaZwierzat.add(new Cow());
        listaZwierzat.add(new Cow());
        listaZwierzat.add(new Cat());
        listaZwierzat.add(new Cat());

        dajGlosyDlaTablicyZwierzat(zwierzeta);
    }

    public static void dajGlosyDlaTablicyZwierzat(Animal[] zwierzeta) {

        for (Animal animal : zwierzeta) {
            animal.makeSound();
        }
    }

    public static void dajGlosyDlaTablicyZwierzat(List<Animal> zwierzeta) {

        for (Animal animal : zwierzeta) {
            animal.makeSound();
        }
    }
}