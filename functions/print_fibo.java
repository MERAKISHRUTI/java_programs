package functions;

import java.util.Scanner;

public class print_fibo {
    public static int print_fibonacci(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else if(num==1)
        {
            return 1;
        }
        else{
            return print_fibonacci(num-1)+print_fibonacci(num-2);
        }


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(print_fibonacci(num));
    }
}
