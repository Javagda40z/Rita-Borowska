package obiekty;

public class Cow implements Animal {

    public void dajeMleko() {
        // krowa daje mleko
    }

    @Override
    public void makeSound() {
        System.out.println("Muuuuu !!!!");
    }

    @Override
    public void move() {
        System.out.println("chodze");
    }
}
