package functions;

import java.util.Scanner;

public class calculator {
    public static void calculator() {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("enter 1 for add");
            System.out.println("enter 2 for subtract");
            System.out.println("enter 3 for multiplication");
            System.out.println("enter 4 for division");
            int ans = sc.nextInt();
            if(ans==1)
            {
                System.out.println(addition(a,b));
            }
            else if(ans==2)
            {
                System.out.println(subtraction(a,b));
            }
            else if(ans==3)
            {
                System.out.println(mul(a,b)); 
            }
            else if(ans==4)
            {
                System.out.println( division(a,b));
            }
            else{
                System.out.println("wrong output");
            }

    }
    public static int addition(int a,int b)
    {
        return a+b;
    }
    public static int subtraction(int a,int b)
    {
        return a-b;
    }
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static int division(int a,int b)
    {
        return a/b;
    }
    public static void main(String[] args) {
        calculator();
    }
}
