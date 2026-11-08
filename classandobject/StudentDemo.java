package classandobject;
import java.util.Scanner;
class Student{
        String name;
        int age;
        String studentId;
        Student(String name, int age, String studentId){
            this.name = name;
            this.age = age;
            this.studentId = studentId;
        }
        void displayInfo(){
            System.out.println("name: "+ this.name);
            System.out.println("age: "+ this.age);
            System.out.println("Student ID: "+ this.studentId);
        }
    }
public class StudentDemo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("name: ");
        String name = input.nextLine();
        System.out.println("age: ");
        int age = input.nextInt();
        System.out.println("Student ID: ");
        String studentId = input.next();
        Student student = new Student(name, age, studentId);
        student.displayInfo();
        input.close();
}
}