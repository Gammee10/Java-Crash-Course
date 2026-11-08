package javabasics;
import java.util.Scanner;
public class StudentGradeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Enter Score 1: ");
	int firstScore = input.nextInt();
	System.out.println("Enter Score 2: ");
	int secondScore = input.nextInt();
	System.out.println("Enter Score 3: ");
	int thirdScore = input.nextInt();

	System.out.println("Student: " + name);
	double average = (firstScore + secondScore + thirdScore) / 3;
	System.out.println("Average: " + average);
	input.close();
    }
}