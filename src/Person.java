abstract public class Person {   //abstract class
    private int age;
    private String name;

    Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    //abstract method
  abstract void display();

    //get & set
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
}
