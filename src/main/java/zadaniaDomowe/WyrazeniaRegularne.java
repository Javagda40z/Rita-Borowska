package zadaniaDomowe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrazeniaRegularne {

    public static void main(String[] args) {

        String tekst  = "Ala ma kota, dwa psy i rybki";

        //1
        System.out.println("Czy tekst składa sie z samych cyfr ? " + tekst.matches("\\d+"));

        //2
        String inneImie = tekst.replace("Ala", "Rita");
        System.out.println("Zmiana wyrazu w danym tekście: " + inneImie);
        System.out.println(tekst.replaceFirst("Ala", "Rita"));

        //3
        String bezBialychZnakow = tekst.replace(" ", "");
        System.out.println("Tekst bez bialych znakow: " + bezBialychZnakow);
        System.out.println(tekst.replaceAll(" ", ""));

        //4
        String tekst2 = "Ala ma dwa konie.";
        Pattern regex2 = Pattern.compile("\\D{5}");
        Matcher matcher2 = regex2.matcher(tekst2);
        boolean czyPrawda = matcher2.matches();
        System.out.println("Czy wyrazenie jest z samych liter a jego dlugosc wynosi 5 ?"
                + " " +  czyPrawda);

        //5
        Pattern regex3 = Pattern.compile("\\D+\\p{Punct}$");
        Matcher matcher3 = regex3.matcher(tekst2);
        boolean czyPrawda2 = matcher3.matches();
        System.out.println("Czy wyrazenie jest zdaniem ? " + " " + czyPrawda2);
        // tutaj widzi mi kazdy znak intepunkcyjny na koncu zdania - nie mam pojecia jak ustawic aby
        // widoczna byla tylko ' . '

      //6
        String liczba = "346.698766";
        Pattern regex4 = Pattern.compile("[0-9]{3}.[0-9]{6}");
        Matcher matcher4 = regex4.matcher(liczba);
        boolean czyZmiennoprzecinkowa = matcher4.matches();
        System.out.println("Czy podana liczba jest zmiennoprzecinkowa ? " +  czyZmiennoprzecinkowa);

        //7
        String numerTelefonu = "234-457-123";
        Pattern regex1 = Pattern.compile("[0-9]{3}-[0-9]{3}-[0-9]{3}");
        Matcher matcher1 = regex1.matcher(numerTelefonu);
        boolean czyNrTelPoprawny = matcher1.matches();
        System.out.println("Czy nr telefonu jest poprawny ? " + czyNrTelPoprawny );

    }

}
