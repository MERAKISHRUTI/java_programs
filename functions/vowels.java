
package functions;
import java.util.Scanner;

public class vowels {
    public static boolean vowel()
    {
        Scanner sc= new Scanner(System.in);
         char c=sc.next().charAt(0);
         if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u')
         {
            return true;
         }
        else if(c=='A' || c=='E' || c=='I' || c=='O' ||c=='U')
         {
            return true;
         }
        return false;
        
    } 
    public static void main(String[] args) {
        System.out.println(vowel());
    }
}
