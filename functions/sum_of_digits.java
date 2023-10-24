package functions;
import java.util.*;
public class sum_of_digits {

    public static void sum_of_digitss(int num)
    {
        int sum=0;
        while(num!=0)
        {
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        sum_of_digitss(num);

    }
}
