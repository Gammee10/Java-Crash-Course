package ClassAndObject;
import java.util.Scanner;
class Student{
        String name;
        int age;
        String StudentId;
        Student(String name, int age, String StudentId){
            this.name = name;
            this.age = age;
            this.StudentId = StudentId;
        }
        void displayInfo(){
            System.out.println("name: "+ this.name);
            System.out.println("age: "+ this.age);
            System.out.println("StudentId: "+ this.StudentId);
        }
    }
public class StudentClass {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("name: ");
        String name = input.nextLine();
        System.out.println("age: ");
        int age = input.nextInt();  
        System.out.println("StudentId: ");
        String StudentId = input.next(); 
        Student s1 = new Student(name, age, StudentId);
        s1.displayInfo();
        input.close();
}
}