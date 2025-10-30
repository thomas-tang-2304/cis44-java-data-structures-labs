package calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static String generateAnswer(float a, float b, char operator) {
        float total = 0;
        switch (operator) {
            case '+':
                total = (a + b);
                break;
            case '-':
                total = (a - b);
                break;
            case '*':
                total = (a * b);
                break;
            case '/':
                if (b != 0) {
                    total = (a / b);
                } else {
                    return ("Error: Divided by zero");
                }
                break;
            default:
                return ("Error: Invalid operator");
        }
        return checkNumberType(total);
    }

    public static float scanNumber(Scanner scanner) {
        
        float number = 0;

        boolean isValid = false;

        while (!isValid) {
            try {
                number = scanner.nextFloat();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Consume the invalid input to prevent an infinite loop
            }
        }
         
        
        return number;
    }
            
    public static String checkNumberType(float number) {
        String afterDot = String.valueOf(number).split("[\\.]")[1];
        for (int i = 0; i < afterDot.length(); i++) {
            if (afterDot.charAt(i) != '0') {
                return String.valueOf(number);
            }
        }
        return String.valueOf(number).split("[\\.]")[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String exitCode = "not exit";

        
        while (!exitCode.equals("exit")) {
            
            System.out.println("Enter number to calculate: ");
            float a = scanNumber(scanner);
            char operator = scanner.next().charAt(0);
            float b = scanNumber(scanner);
            System.out.println("= "+generateAnswer(a, b, operator));

            System.out.println("To end to process, press 'exit', to continue press any key and enter");
            exitCode = scanner.next();
        }
        scanner.close();
    }
    
}