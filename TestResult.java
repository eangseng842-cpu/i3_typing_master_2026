import java.util.Scanner;

public class TestResult {
    public static void displayScreen(Scanner scanner, String userInput, double timeInMinutes) {
        int totalChars = userInput.length();
        int words = userInput.isEmpty() ? 0 : userInput.split("\\s+").length;
        
        int cpm = (int) (totalChars / timeInMinutes);
        int wpm = (int) (words / timeInMinutes);
        
        int expectedLength = 200; 
        int mistakes = Math.abs(expectedLength - totalChars); 

        System.out.println("\n--- Typing Test Level 1 Result ---");
        System.out.println("Speed (characters/min): " + cpm);
        System.out.println("      (words/min): " + wpm);
        System.out.println("Total input characters: " + totalChars);
        System.out.println("Total mistakes: " + mistakes);

        System.out.println("\n1. Next level");
        System.out.println("2. Logout");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // FIX: Consume the newline character
        
        switch(choice) {
            case 1:
                System.out.println("Loading Next Level... (Not yet implemented)\n");
                break;
            case 2:
                System.out.println("Logging out to Main Menu...\n");
                break;
            case 3:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Returning to main menu.\n");
        }
    }
}