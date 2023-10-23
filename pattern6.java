import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        System.out.println("reverse rhombus");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=size;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<size;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
