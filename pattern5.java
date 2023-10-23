import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        System.out.println("rhombus");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
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
