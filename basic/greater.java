package basic;
import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int first =sc.nextInt();
        int second =sc.nextInt();
        int third=sc.nextInt();
        System.out.println(((first>second)&&(first>second))?"first is greater":((second>first)&&(second>third))?"second is greater":((third>first)&&(third>second))?"third is greater":"no one is greater");
sc.close();   
    }
}
