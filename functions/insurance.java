package functions;
import java.util.Scanner; 
import java.util.*;
public class insurance {
      public static void get_insurence(String name,String gender,int age,String city)
    {

        if(age>=25 && age<=35 && gender.equals("male") && city.equals("Metro"))
        {
            System.out.println("premium is 6%");
        }
        else if(age>=25 && age<=40 && gender.equals("male") && city.equals("Non-metro"))
        {
            System.out.println("premium is 4%");
        }
        else if(age>=25 && age<=42 && gender.equals("female") && city.equals("Metro"))
        {
            System.out.println("premium is 3%");
        }
        else if(age>=25 && age<=35 && gender.equals("female") && city.equals("Non-metro"))
        {
            System.out.println("premium is 2%");
        }

    }
    public static void insurances() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        System.out.println("enter your gender");
        String gender=sc.nextLine();
        System.out.println("enter your age");
        int age=sc.nextInt();
        System.out.println("enter city ");
        System.out.println("1) Metro");
        System.out.println("2)Non-metro");
        int ch=sc.nextInt();
        String city="";
        if(ch==1)
        {
            city="Metro";
        }
        else{
            city="Non-metro";
        }
        System.out.println(name +" "+gender +" "+age +" "+city);
        get_insurence(name,gender,age,city);

    }
  
    public static void main(String[] args) {
        insurances();
    }
}
