package ClassAndObject;
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
        Student s1 = new Student("Abel", 20, "AB123");
        s1.displayInfo();
}
}