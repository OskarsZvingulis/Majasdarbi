import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Čau, es atbildēšu uz trīs jautājumiem");
        System.out.println("Bliez vaļā!!");

        String jautajums = scan.nextLine();

        if (jautajums.equals("Kāds laiks būs rīt")) {
            System.out.println("Laiks rīt būs labs!! ");

        } else {
            System.out.println("Nav atbildes uz šo jautājumu!!");
        }

        System.out.println("2. jautājums ");

        String otraisjautajums = scan.nextLine();

        if (otraisjautajums.equals("Kā Tevi sauc")) {
            System.out.println("Mani sauc mūžīgais optimists!!");

        } else {
            System.out.println("Nesaprotu jautājumu!!");
        }

        System.out.println("3. jautājums ");

        String tresaisjautajums = scan.nextLine();

        if (tresaisjautajums.equals("Kur Tu dzīvo")) {
            System.out.println("Es dzīvoju čuhņā !!");

        } else {
            System.out.println("Foršs jautājums !!");
        }
        System.out.println("Paldies par jautājumiem!! ");


    }
}