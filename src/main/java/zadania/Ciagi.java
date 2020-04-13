package zadania;

import java.util.ArrayList;
import java.util.List;

public class Ciagi {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        lista.add(15);
        lista.add(20);
        lista.add(30);

        System.out.println(lista);
        lista.add(444);
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);

        System.out.println(stworzCiagArytmetyczny(5, 1, 1));
    }

    public static List<Integer> stworzCiagArytmetyczny (int dlugosc, int pierwszy, int roznica) {
        List<Integer> ciag = new ArrayList<>();
        ciag.add(pierwszy);

        for (int i = pierwszy; i < dlugosc; i++) {
            ciag.add(pierwszy + i*roznica);
        }
        return ciag;
    }

    public static boolean stworzCiagArytmetyczny(List<Integer> ciag) {
        for (int i = 1; i + i < ciag.size(); i++){
            if ((ciag.get(i - 1) + ciag.get(i +1)) / 2 != ciag.get(i)) {
                return false;

            }
        }
        return true;
    }

}