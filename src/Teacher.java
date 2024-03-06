public class Teacher extends Person{
    String subject;

    //constructor
    Teacher(String name , int age, String subject){
        super(name , age);
        this.subject = subject;
    }

    //override abstract  method
    void display() {
        System.out.println("Teacher Name: " + getName());
        System.out.println("Teacher age: " + getAge());
        System.out.println("subject: " + subject);
    }
}
