package zadaniaDomowe;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataICzas {

    public static void main(String[] args) {

// dzisiejsza data, godzina + zad 8
        LocalDateTime teraz = LocalDateTime.now();

        System.out.println("dzisiejsza data i godzina - " + teraz);

        DateTimeFormatter aktualna = DateTimeFormatter.ofPattern("HH:mm:ss E yyyy-MM-dd");
        String nowaDataCzas = teraz.format(aktualna);

        System.out.println("DZIS JEST - " + nowaDataCzas);
// 2. dzien roku w danym dniu
        LocalDate dzisiejszaData = LocalDate.now();
        LocalDate poczatekRoku = LocalDate.of(2020, 01, 01);
        System.out.println("Dzisiejszy dzien -  " + dzisiejszaData);
        System.out.println("Pierwszy dzien roku -  " + poczatekRoku);
        System.out.println("Dzisiejszy dzien jest - " + dzisiejszaData.getDayOfYear() + " dniem w roku");

// 3. ilosc dni do konca roku
        LocalDate koniecRoku = LocalDate.of(2020, 12, 31);
        System.out.println("Ostatni dzien roku - " + koniecRoku);
        System.out.println("Do konca roku zostalo - " + (koniecRoku.getDayOfYear()
                - dzisiejszaData.getDayOfYear()) + " dni" );

// 4. roznica dni miedzy datami
        LocalDate pierwszaData = LocalDate.of(1987, 05, 26);
        LocalDate drugaData = LocalDate.of(1984, 02, 27);
//        long roznicaDni = pierwszaData.getDayOfYear() - drugaData.getDayOfYear();
//        long roznicaLat = (pierwszaData.getYear() - drugaData.getYear()) * 365;
//        System.out.println(roznicaDni);
//        System.out.println(roznicaLat);
//        System.out.println("Roznica dni miedzy datami - " + (roznicaLat + roznicaDni));
        // nie mam uwzglednionego roku przestepnego o ile wypada :/
        long iloscDniPomiedzyDatami = ChronoUnit.DAYS.between(drugaData, pierwszaData);
        System.out.println("Roznica dni miedzy datami - " + iloscDniPomiedzyDatami);



//5 czy data jest jedna przed druga
        boolean daty = pierwszaData.isAfter(drugaData);
        boolean datyOdwrotnie = drugaData.isAfter(pierwszaData);

        System.out.println("Czy data1 jest po dacie2 ? " + daty );
        System.out.println("Czy data2 jest po dacie1 ? " + datyOdwrotnie);

// 6 dodanie do danej daty x dni
        System.out.println("Dodanie do dzisiejszej daty 12 dni - " + dzisiejszaData.plusDays(12) );

// 7 rok przestepny

        LocalDate data = LocalDate.of(2014,02, 12);
        System.out.println(data.isLeapYear());

        int rok = 2016;
        boolean rokPrzesteny = ((rok % 4 == 0) && (rok % 100 != 0) || (rok % 400 ==0));
        System.out.println("Czy dany rok jest przestepny ? " + rokPrzesteny);


        }
    }

