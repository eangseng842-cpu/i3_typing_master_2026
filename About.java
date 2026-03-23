import java.util.Scanner;

public class About {
    public static void displayScreen(Scanner scanner) {
        System.out.println("\n--- About Us ---");
        System.out.println("i3 Typing Master v2026");
        System.out.println("Developed by: Ravy Pum and Team");
        System.out.println("This project is a console-based typing speed assessment tool built for the IPE Midterm.");
        System.out.println("\nPress ENTER to return to the main menu...");
        
        scanner.nextLine(); 
    }
}