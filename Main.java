import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to i3 Typing Master v2026");
            System.out.println("To begin, please select one of the following options:");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Reset Password");
            System.out.println("4. Typing Test Screen");
            System.out.println("5. About Us");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    Login.displayScreen(scanner); 
                    break;
                case 2:
                    Register.displayScreen(scanner); 
                    break;
                case 3:
                    ResetPassword.displayScreen(scanner);
                    break;
                case 4:
                    TypingTest.displayScreen(scanner);
                    break;
                case 5:
                    About.displayScreen(scanner);
                    break;
                case 6:
                    System.out.println("Exiting i3 Typing Master. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}