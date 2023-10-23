import java.util.Scanner;

class even_odd{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int first =sc.nextInt();
       System.out.println((first%2==0)?"even":"odd");
       sc.close();
    }
}