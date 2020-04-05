package petle;

public class Application {

    public static void main(String[] args) {
//
//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);
//        }
//
//        for (int j = 100; j >= 0; j--) {
//            System.out.println(j);
//        }
//
//        int k = 0;
//        while (k <= 100) {
//            System.out.println(k);
//            k++;
//        }
//
//        for (int m = 300; m <= 1000; m++) {
//            if (m % 3 == 0) {
//                System.out.println(m);
//            }
//        }
//
//        String napis = "Jestem na bardzo dobrej drodze do zostania profesjonalnym programistą Java";
//
//        System.out.println(napis.length());
//
//        for (int i = 0; i < napis.length(); i = i + 2) {
//            System.out.print(napis.charAt(i));
//        }
//
//        for (int i = napis.length() - 1; i >= 0; i--) {
//            System.out.print(napis.charAt(i));
//        }
//
//        while (true) {
//            System.out.println(napis);
//        }

    }


    public static void dodawnie (int a, int b, int c) {

        int suma = 0;
        while (suma < c) {
            suma = suma + (a + b);
        }
        System.out.println(suma);
    }


}
