import java.util.Scanner;

public class variable_swap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // int first=sc.nextInt();
        // int second=sc.nextInt();
        // first=first+second;
        // second=first-second;
        // first=first-second;
        // second=second;
        // System.out.println(first +" ");
        // System.out.println(second +" ");

// second approach
        int first=sc.nextInt();
        int second=sc.nextInt();
        first=first*second;
        second=first/second;
        first=first/second;
        System.out.println(first);
        System.out.println(second);

        sc.close();
    }
}
