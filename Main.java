import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Enter Score 1: ");
	int score1 = input.nextInt();
	System.out.println("Enter Score 2: ");
	int score2 = input.nextInt();
	System.out.println("Enter Score 3: ");
	int score3 = input.nextInt();
	

	System.out.println("Student: " + name);
	double average = (score1+score2+score3)/3;
	System.out.println("average: " + average);
	input.close();
    }
}