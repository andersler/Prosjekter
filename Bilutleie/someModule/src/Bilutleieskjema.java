import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


/**
 * @Author Anders Lerang
 */
public class Bilutleieskjema {

    public final static Scanner TASTATUR = new Scanner(System.in);

    List<Bil> biler = Arrays.asList(

            new Bil("Volkswagen golf country", "Blå", "Volkswagen", "E4432", 'B', false, 5000),
            new Bil("Citroen C1", "Rød", "Citroen", "E5521", 'A', true, 10000),
            new Bil("BMW-7 serie", "Svart", "BMW", "E9912", 'A', true, 75000)

    );

    UtleierAdresse utleieradresse = new UtleierAdresse("Flyplassvegen 555", 5288, "Bergen", 1);
    Utleiekontor utleiekontor = new Utleiekontor(utleieradresse, 91223490, biler);

    public Bilutleieskjema() {

    }

    /**
     * Metode for reservasjonsdato og returdato
     */
    public void fyllDato() {

        SimpleDateFormat sdfRes = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat sdfRet = new SimpleDateFormat("MM-dd-yyyy");


        System.out.println("Når vil du reservere?");
        System.out.println("Eksempel: 12-25-2013");
        System.out.print("Skriv inn dato: ");

        String lease = TASTATUR.nextLine();

        try {
            Date resDato = sdfRes.parse(lease);

            sdfRes = new SimpleDateFormat("EEE, d MMM yyyy");
            System.out.println("Reservasjonsdato: " + sdfRes.format(resDato));
        } catch (ParseException e) {
        }

        System.out.println("Når vil du returnere?");

        String ret = TASTATUR.nextLine();

        try {
            Date retDato = sdfRet.parse(ret);

            sdfRet = new SimpleDateFormat("EEE, d MMM yyyy");
            System.out.println("Returdato: " + sdfRet.format(retDato));
        } catch (ParseException e) {
        }
    }

    /**
     * Metode for å velge kontor. Det er foreløpig kun ett kontor
     */
    public void velgKontor() {

        System.out.println("Foreløpig kun ett utleiekontor");

        System.out.println(utleiekontor);

    }

    /**
     * Metode for å bestille bil
     */
    public void bestillBil() {


        System.out.println("Alle biler");
        System.out.println("Velg en ledig bil");
        for (Bil bil : biler) {

            System.out.println(bil);
            System.out.println("--------------------");


        }
        System.out.println("Skriv inn registreringsnummer til ledig bil");

        String reg = TASTATUR.nextLine();
        System.out.println(reg);

        List<Bil> reservertBil = biler
                .stream()
                .filter(a -> a.getRegistreringsnummer().equals(reg) && a.isLedig())
                .collect(Collectors.toList());

        if (reservertBil.isEmpty()) {
            System.out.println("Bilen er ikke ledig, prøv å bestill på nytt");
            System.exit(0);
        } else {
            System.out.println("Du har valgt bil!");
            for (int i = 0; i < reservertBil.size(); i++) {
                reservertBil.get(i).setLedig(false);
                System.out.println(reservertBil.get(i));

            }
            System.out.println("\n");
        }
    }


    /**
     * Metode for å returnere en bil
     */
    public void returnerBil() {

        System.out.println("Skriv inn registreringsnummer til bilen du vil returnere");

        String reg = TASTATUR.nextLine();
        System.out.println(reg);

        List<Bil> returBil = biler
                .stream()
                .filter(a -> a.getRegistreringsnummer().equals(reg) && !a.isLedig())
                .collect(Collectors.toList());

        if (returBil.isEmpty()) {
            System.out.println("Bilen har ikke blitt leaset, prøve på nytt");
            System.exit(0);
        } else {
            System.out.println("Du har returnert bilen!");
            for (int i = 0; i < returBil.size(); i++) {
                returBil.get(i).setLedig(true);
                System.out.println(returBil.get(i));
            }
            System.out.println("\n");


        }
    }

        /**
         * Metode for kunden sin informasjon
         */

        public void fyllInfo () {

            System.out.println("Fornavn?");
            String fornavn = TASTATUR.nextLine();
            System.out.println(fornavn);

            System.out.println("Etternavn?");
            String etternavn = TASTATUR.nextLine();
            System.out.println(etternavn);


            System.out.println("Gateadresse?");
            String gateadresse = TASTATUR.nextLine();
            System.out.println("Postnummer?");
            int postnr = Integer.parseInt(TASTATUR.nextLine());
            System.out.println("Poststed?");
            String poststed = TASTATUR.nextLine();

            KundeAdresse adresse = new KundeAdresse(gateadresse, postnr, poststed);

            System.out.println("Telefonnummer?");
            int tlf = Integer.parseInt(TASTATUR.nextLine());

            System.out.println("Kontonr?");
            long kontonr = Integer.parseInt(TASTATUR.nextLine());
            System.out.println(kontonr);


            Kunde kunde = new Kunde(fornavn, etternavn, adresse, tlf);

            System.out.println("Velkommen som kunde!");
            System.out.println(kunde);

        }
        /**
         * Metode for å sende kvitering
         */
        public void sendKvittering(){
            System.out.println("Bevis på at du har reservert en bil!");

        }
    }

