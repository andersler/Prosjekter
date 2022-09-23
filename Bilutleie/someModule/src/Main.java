
import java.util.Scanner;

        /**
        * @Author Anders Lerang
        */
public class Main {


    public static void main(String[] args) {
        System.out.println("Reserver eller Returner?");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Bilutleieskjema bilutleieskjema = new Bilutleieskjema();

        if (str.equals("Reserver")) {
            bilutleieskjema.bestillBil();

            bilutleieskjema.fyllDato();

            bilutleieskjema.velgKontor();

            bilutleieskjema.fyllInfo();

            bilutleieskjema.sendKvittering();
        } else if (str.equals("Returner")){
           bilutleieskjema.returnerBil();
        }
        else
            System.out.println("Feil, prøv på nytt");

        sc.close();
    }
}
