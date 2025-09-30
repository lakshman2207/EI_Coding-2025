import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your password (or type 'exit' to quit):");
            String password = scanner.nextLine();
            if (password.equalsIgnoreCase("exit")) {
                break;
            }

            boolean allPassed = true;

            PasswordStrengthStrategy[] strategies = {
                new LengthStrategy(),
                new NumberStrategy(),
                new SpecialCharStrategy()
            };

            for (PasswordStrengthStrategy strategy : strategies) {
                System.out.println(strategy.getDescription());
                boolean result = strategy.checkStrength(password);
                System.out.println("Check: " + (result ? "Passed" : "Failed"));
                if (!result) {
                    allPassed = false;
                }
            }

            System.out.println("Overall password strength: " + (allPassed ? "Strong" : "Weak"));
            System.out.println("-----------------------------------");
        }

        scanner.close();
    }
}