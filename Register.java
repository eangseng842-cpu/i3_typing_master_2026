import java.util.Scanner;

public class Register {
    public static void displayScreen(Scanner scanner) {
        System.out.println("\n--- New User Registration ---"); 
        System.out.print("Input a unique username (leave blank to cancel): "); 
        String username = scanner.nextLine();

        if (username.trim().isEmpty()) {
            System.out.println("Registration cancelled. Returning to main menu...\n");
            return; 
        }

        System.out.print("Input password: "); 
        String password = scanner.nextLine();

        System.out.print("Input confirm password: "); 
        String confirmPassword = scanner.nextLine(); 

        if (password.equals(confirmPassword)) {
            System.out.println("Registration successful for user: " + username + "\n");
        } else {
            System.out.println("Passwords do not match. Registration failed.\n");
        }
    }
}