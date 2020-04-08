package zadaniaDomowe;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;

public class Tablice {

    public static void main(String[] args) {

// Zad 1-6
        double[] mojaTablica1 = new double[8];
        mojaTablica1[0] = 6;
        mojaTablica1[1] = 3;
        mojaTablica1[2] = 5;
        mojaTablica1[3] = 7;
        mojaTablica1[4] = 1;
        mojaTablica1[5] = 1;
        mojaTablica1[6] = 7;
        mojaTablica1[7] = 9;

        double sumaLiczbTablicy1 = mojaTablica1[0] + mojaTablica1[1] + mojaTablica1[2] + mojaTablica1[3]
                + mojaTablica1[4] + mojaTablica1[5] + mojaTablica1[6] + mojaTablica1[7];

        System.out.println("Srednia liczb z tablicy" + " " + sumaLiczbTablicy1 / 8);

        System.out.println("Najwiekszy elemet tablicy = " + NumberUtils.max(mojaTablica1));
        System.out.println("Najmniejszy element tablicy = " + NumberUtils.min(mojaTablica1));

        double[] mojaTablica2 = new double[8];
        mojaTablica2[0] = 1;
        mojaTablica2[1] = 2;
        mojaTablica2[2] = 3;
        mojaTablica2[3] = 4;
        mojaTablica2[4] = 5;
        mojaTablica2[5] = 6;
        mojaTablica2[6] = 7;
        mojaTablica2[7] = 8;

        double sumaLiczbTablicy2 = mojaTablica2[0] + mojaTablica2[1] + mojaTablica2[2] + mojaTablica2[3]
                + mojaTablica2[4] + mojaTablica2[5] + mojaTablica2[6] + mojaTablica2[7];

        System.out.println("Sume elementow tablicy1 = " + sumaLiczbTablicy1);
        System.out.println("Suma elementow tablicy2 = " + sumaLiczbTablicy2);

        System.out.println("Suma elementow tablicy1 i tablicy2" + " = "
                + (sumaLiczbTablicy1 + sumaLiczbTablicy2));
        System.out.println("Mnozenie elementow tablicy1 i tablicy2" + " = "
                + sumaLiczbTablicy1 * sumaLiczbTablicy2);


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
