import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(i==0 || i==size-1)
            {
                for(int j=0;j<size;j++)
                System.out.print("*");
            }
            else{
                System.out.print("*");
                for(int j=0;j<size-2;j++)
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
