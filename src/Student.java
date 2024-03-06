 public class Student extends Person{
  int grade;
  //constructor
     Student(String name, int age , int grade){
         super(name, age);
         this.grade = grade;
     }
     //abstract method
     @Override
     void display() {
         System.out.println("Student name:  " + getName());
         System.out.println("Student age:  " + getAge());
         System.out.println("Student grade:  " + grade);
     }
 }
