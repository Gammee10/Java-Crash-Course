import java.util.Scanner;
public class ScoreCheck {
    public static void main(String[] args) {
        System.out.println("Enter your score: ");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        if (score>100 || score<0) {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
            
        }else if (score>90) {
            System.out.println("You got an A!");
            
        } else if (score>80) {
            System.out.println("You got a B!");
        } else if (score>70) {
            System.out.println("You got a C!");
        } else if (score>60) {
            System.out.println("You got a D!");
        } else {
            System.out.println("You got an F!");
        }
        input.close();

    }
}
