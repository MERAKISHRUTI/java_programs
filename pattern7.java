import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i ||i==size-1)
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
