package zadania;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;

public class Tablice {

    public static void main(String[] args) {
        int[] tablica = new int[] {1,2,3};
//        System.out.println(tablica);        // tak wyswietli indeks tablicy, nie jej zawartosc
//        System.out.println(Arrays.toString(tablica));
//        zamienPierwszyITrzeciElement(tablica);
//        System.out.println(Arrays.toString(tablica));

        int[] nieposortowanaTablica = new int[]{1,3,3,2,4,1};
//        System.out.println(Arrays.toString(nieposortowanaTablica));
//        Arrays.sort(nieposortowanaTablica);
//        System.out.println(Arrays.toString(nieposortowanaTablica));

        System.out.println(Arrays.toString(nieposortowanaTablica));
        System.out.println(NumberUtils.max(nieposortowanaTablica));
        System.out.println(NumberUtils.min(nieposortowanaTablica));
        System.out.println(Arrays.toString(nieposortowanaTablica));

    }

    public static void zamienPierwszyITrzeciElement ( int[] tablica) {

        int zmienna = tablica[0];
        tablica[0] = tablica[2];            // odnosimy się przez 0 bo tablice są indeksowane od 0
        tablica[2] = zmienna;

    }
}
