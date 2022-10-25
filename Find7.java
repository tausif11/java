import java.util.Scanner;
public class Find7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%10==7)
        {
            System.out.println("this number is end with "+n);
        }
        else
        {
            System.out.println("this number is not  end with "+n);
        }
        s.close();
    }
}
