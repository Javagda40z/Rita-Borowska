package zadania;

public class Program {

    public static void main(String[] args) {
//        Program program = new Program();
//        program.tabliczkaMnozenia(5);
//        program.tabliczkaMnozenia(10);

        TabliczkaMnozenia tabliczkaMnozenia = new TabliczkaMnozenia(5);
        System.out.println(tabliczkaMnozenia.getLiczba());
        tabliczkaMnozenia.wypiszTabliczke();

        tabliczkaMnozenia = new TabliczkaMnozenia( 10);
        tabliczkaMnozenia.wypiszTabliczke();

        System.out.println(sumaLiczb(1,5));

    }

        //Napisz funkcję, która dla zadanych dwóch parametrów X i Y obliczy sumę liczb od X do Y

    public static int sumaLiczb (int x, int y){
        int suma = 0;
        for (int i = x; i <= y; i++) {
            suma = suma + i;
        }
        return suma;
    }

    public static void tabliczkaMnozenia(int liczba) {
        System.out.println("Tabliczka mnożenia dla liczby: " + liczba);

        for (int i = 1; i <= liczba; i++) {
            System.out.println(liczba + " x " + i + " = " + liczba * i);
        }

    }

    // Tabliczka mnożenia dla liczby 5 :
    // 5 x 1 = 5
    // 5 x 2 = 10
    // 5 x 3 = 15
    // 5 x 4 = 20
    // 5 x 5 = 25


}
