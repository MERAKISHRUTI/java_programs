package basic;
import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int no=sc.nextInt();
        int sum=0;
        while(no!=0)
        {
            sum=sum+no%10;
            no=no/10;
        }
        System.out.println(sum);
        sc.close();
    }
}
