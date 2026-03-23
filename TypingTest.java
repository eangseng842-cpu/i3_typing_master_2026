import java.util.Scanner;

public class TypingTest {
    public static void displayScreen(Scanner scanner) {
        System.out.println("\n--- Typing Test Level 1 ---");
        System.out.println("........");
        System.out.println("Type the following paragraph(s) to test your typing speed and quality (press ENTER to end the test and display the result):"); 
        System.out.println("ffff jjjj dddd kkkk ssss llll aaaa ;;;; fdsa jkl; fdsa jkl; asdf jkl; asdf");
        System.out.println("jkl; sad dad had lad ask all fall hall flask shall gash hash flash glass glad flag sag hash lash.");
        System.out.println("Ask a glad lad all a salad.\n");

        long startTime = System.currentTimeMillis();
        
        System.out.print("Start typing: ");
        String userInput = scanner.nextLine();
        
        long endTime = System.currentTimeMillis();

        double timeInMinutes = (endTime - startTime) / 60000.0;
        if (timeInMinutes == 0) timeInMinutes = 0.01; 

        TestResult.displayScreen(scanner, userInput, timeInMinutes);
    }
}