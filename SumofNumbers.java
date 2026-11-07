import java.util.Scanner;
public class SumofNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = input.nextInt();
        int sum = 0;
        while (number>0) {
            sum+=number;
            number--;
            
        }
        System.out.println("Sum: " + sum);
        input.close();

}
}