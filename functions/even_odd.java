package functions;

import java.util.Scanner;

public class even_odd {
    public static void even_odd(int num)
    {
        if(num%2==0)
        {
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        even_odd(num);
    }
}
