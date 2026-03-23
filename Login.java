import java.util.Scanner;

public class Login {
    public static void displayScreen(Scanner scanner) {
        System.out.println("\n--- Authentication ---");
        System.out.print("Username (leave blank to cancel): ");
        String username = scanner.nextLine();

        if (username.trim().isEmpty()) {
            System.out.println("Login cancelled. Returning to main menu...\n");
            return;
        }

        System.out.print("Password: ");
        String password = scanner.nextLine();

        System.out.println("Login successful! Welcome, " + username + ".\n");
    }
}