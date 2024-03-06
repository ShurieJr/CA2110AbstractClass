public class Main {
    public static void main(String[] args) {
        Student std = new Student("Ali", 23, 100);
        Teacher t = new Teacher("Mohamed", 45, "C++");

        Person[] ob = new Person[4];
        ob[0] = std;
        ob[1] = t;
        ob[0].display();    //std.display();
        System.out.println("----------------------");
        ob[1].display();   // t.display();
    }
}