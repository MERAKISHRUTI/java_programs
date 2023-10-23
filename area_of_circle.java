import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        System.out.println(3.14*radius*radius);
        sc.close();
    }
}
