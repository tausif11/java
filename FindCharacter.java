import java.util.Scanner;

///import javax.lang.model.util.ElementScanner14;
/**
 * FindCharacter
 */
public class FindCharacter {

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >='A' && ch<='Z')
        {
            System.out.println(1);
        }
        else if(ch >='a' && ch<='z')
        {
            System.out.println(0);
        }
        else 
        {
            System.out.println(-1);
        }
        sc.close();
    }
    
}
