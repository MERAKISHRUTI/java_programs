package functions;

import java.util.Scanner;

public class prime {
    public static void prime()
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int ans=1;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                ans=i;
            }
        }
        if(ans==1)
        {
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
    }
    public static void main(String[] args) {
        prime();
    }
}
