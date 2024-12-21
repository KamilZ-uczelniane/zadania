import java.util.Scanner;

public class UserInputApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj! Podaj swoje dane:");

        System.out.print("Imię: ");
        String imie = scanner.nextLine();

        System.out.print("Nazwisko: ");
        String nazwisko = scanner.nextLine();

        System.out.print("Wiek: ");
        int wiek = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Zainteresowania: ");
        String zainteresowania = scanner.nextLine();

        System.out.print("Marzenie z dzieciństwa: ");
        String marzenie = scanner.nextLine();

        System.out.println("\nTwoje dane:");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
        System.out.println("Zainteresowania: " + zainteresowania);
        System.out.println("Marzenie z dzieciństwa: " + marzenie);

        System.out.println("Utworzył: Kamil Z. 167876");
        scanner.close();
    }
}
