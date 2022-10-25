class student
{
         String name;    // Data member of the class
         int age;        // Data member of the class

         public void printInfo() {          ////  Member function of the class
            System.out.println(this.name);
            System.out.println(this.age);
         }

         student(String name, int age)  // Parametrized Constructor made
         {
            this.name = name;
            this.age = age;
         }
}

class pen
{
    String color;
    String type;

    public void Write() {
       System.out.println(this.color);
       System.out.println(this.type);
    }
     pen(String color, String type) {
        this.color = color;
        this.type = type;
        
    }
}
public class Oops {

    public static void main(String[] args) {
       student s1 = new student("Spartan" , 22);  //Here is value passed in the constructor
       s1.printInfo();

       pen s2 = new pen("Black" , "BallPoint");
       
       s2.Write();
    }
}
