import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
