package obiekty;

public class Cat implements Animal {

    public static int licznikKotow = 0;
    private int licznik = 0;
    private String imie;

    public Cat() {
        this("Kot o ID: " + licznikKotow);
    }

    public Cat(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void drap() {
        //kot drapie
    }

    public void eatMouse() {
        licznik++;  // <-> licznik = licznik+1;
        System.out.println("Zjadlem" + licznik + "myszy");
    }

    @Override
    public void makeSound() {

        System.out.println("Miauuuu !!!");
    }


    @Override
    public void move() {
        System.out.println("chodze");

    }
}
