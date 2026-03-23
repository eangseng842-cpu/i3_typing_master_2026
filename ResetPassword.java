import java.util.Scanner;

public class ResetPassword {
    public static void displayScreen(Scanner scanner) {
        System.out.println("\n--- Reset Password ---");
        System.out.print("Enter your username (leave blank to cancel): ");
        String username = scanner.nextLine();

        if (username.trim().isEmpty()) {
            System.out.println("Password reset cancelled. Returning to main menu...\n");
            return;
        }

        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();

        System.out.print("Confirm new password: ");
        String confirmPassword = scanner.nextLine();

        if (newPassword.equals(confirmPassword)) {
            System.out.println("Password successfully reset for user: " + username + "\n");
        } else {
            System.out.println("Passwords do not match. Password reset failed.\n");
        }
    }
}