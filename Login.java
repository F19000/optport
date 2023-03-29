import java.util.Scanner;

public class Login {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String gebruikersnaam;
        String wachtwoord;
        boolean isAuthenticated = false;

        do {
            System.out.print("Voer uw gebruikersnaam in: ");
            gebruikersnaam = scanner.nextLine();

            System.out.print("Voer uw wachtwoord in: ");
            wachtwoord = scanner.nextLine();

            if (gebruikersnaam.equals("figo") && wachtwoord.equals("helm")) {
                System.out.println("Welkom in BoodschApp");
                isAuthenticated = true;
            } else {
                System.out.println("Uw gegevens kloppen niet");
            }
        } while (!isAuthenticated);
        new Menu().run();
    }

}