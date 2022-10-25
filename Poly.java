//import java.util.jar.Attributes.Name;

class polymorphism
{
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }
    public void printInfo(int age) {
        System.out.println(age);
    }
    public void printInfo(String name , int age) {
        System.out.println(name + " " +age);
    }
    
}
public class Poly {
    public static void main(String[] args) {
        polymorphism s1 = new polymorphism();
        s1.name = "Spartan";
        s1.age = 22;
        s1.printInfo(s1.name,s1.age);
    }
}
