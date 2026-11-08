package methodsandcodeorganisation;
import java.util.Scanner;

public class FindMax {
    static int findMax(int firstNumber, int secondNumber){
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else{
            return secondNumber;
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = input.nextInt();
        System.out.println("The maximum number is: " + findMax(firstNumber, secondNumber));
        input.close();
    }
}
