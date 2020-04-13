package zadaniaDomowe;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;

public class Tablice {


    public static void main(String[] args) {

// Zad 1-6
        double[] mojaTablica1 = new double[]{6,3,5,7,1,1,7,9};

        double suma1 = 0;
        for (int i = 0; i < mojaTablica1.length; i ++) {
            suma1 += mojaTablica1[i];
        }
        System.out.println("Suma licz z tablicy 1 = " + suma1);

        System.out.println("Srednia liczb z tablicy 1 = " + " " + suma1 / mojaTablica1.length);

        System.out.println("Najwiekszy elemet tablicy 1  - " + NumberUtils.max(mojaTablica1));
        System.out.println("Najmniejszy element tablicy 1  -  " + NumberUtils.min(mojaTablica1));

        double[] mojaTablica2 = new double[] {1,2,3,4,5,6,7,8};

        double suma2 = 0;
        for (int i = 0; i < mojaTablica2.length; i ++) {
            suma2 += mojaTablica2[i];
        }
        System.out.println("Suma liczb tablicy 2 = " + suma2 );

        System.out.println("Mnozenie elementow tablicy1 i tablicy2" + " = "
                + suma1 * suma2);

// Zad7 Tablica Stringow z imionami

        String[] imiona = new String[]{"piotr", "kasia", "adam", "tomek", "andrzej"};

        System.out.println("Imiona z tablicy - " + Arrays.toString(imiona));
        System.out.println("Wilekosc tablicy = " + imiona.length);

        for (String j : imiona) {
            System.out.println(j.toUpperCase().substring(0, 1) + j.toLowerCase().substring(1));
        }

// zad8
        int[] tab1 = new int[]{6,2,4,5};
        int[] tab2 = new int[]{7,9,1,2};
        int[] tab3 = new int[tab1.length + tab2.length];

        System.out.println("dlugosc 1 tablicy = " + tab1.length);
        System.out.println("dlugosc 2 tablicy = " + tab2.length);
        System.out.println("dlugosc 3 tablicy = " + tab3.length);

        System.arraycopy(tab1, 0, tab3,0, tab1.length);
        System.arraycopy(tab2,0, tab3, tab1.length, tab2.length);

        System.out.println("zawartosc tablicy 1 = " + Arrays.toString(tab1));
        System.out.println("zawartosc tablicy 2 = " + Arrays.toString(tab2));
        System.out.println("zawartosc tablicy 1 i 2 = " + Arrays.toString(tab3));


        }

    }
