package MethodsAndCodeOrganisation;
import java.util.Scanner;

public class FindMax {
    static int Findmax(int num1, int num2){
        if (num1>num2) {
            return num1;            
        } else{
            return num2;
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = input.nextInt();
        System.out.println("Enter num2: ");
        int num2 = input.nextInt();
        System.out.println("The maximum number is: "+ Findmax(num1, num2));
        input.close();
    }
}
