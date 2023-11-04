package basic;
import java.util.Scanner;

public class area_of_rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        System.out.println(length*breadth);
        sc.close();
    }
}
