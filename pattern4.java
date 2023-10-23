import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        System.out.println("opposite triangle");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=size;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
