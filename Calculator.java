import java.util.Scanner;

public class Calculator {
    public static void calculator() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("enter 1 for add");
            System.out.println("enter 2 for subtract");
            System.out.println("enter 3 for multiplication");
            System.out.println("enter 4 for division");
            int ans = sc.nextInt();

            switch (ans) {
                case 1: {
                    System.out.println("addition " + (a + b));
                    break;
                }
                case 2: {
                    System.out.println("subtraction " + (a - b));
                    break;
                }
                case 3: {
                    System.out.println("multiplication " + (a * b));
                    break;
                }
                case 4: {
                    System.out.println("division " + (a / b));
                    break;
                }
                default: {
                    System.out.println("incorrect choice");
                }
                sc.close();
            }
            System.out.println("do you want to continue? tyoe 1 if yes otherwise type 0");
             int continu=sc.nextInt();
             if(continu==0)
             {
                break;
             }
        }


    }

    public static void atm_machine()
    {
        int balance=0;
        while(true)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("press 1 for balance");
            System.out.println("press 2 for deposit");
            System.out.println("press 3 for withdraw");
            int ans=sc.nextInt();
            switch(ans)
            {
                case 1:
                {
                    System.out.println(balance);
                    break;
                }
                case 2:{
                    balance=forDeposit(balance);
                    System.out.println(balance);
                    break;
                }
                case 3:
                {
                    if(balance==0)
                    {
                        System.out.println("kangaal");
                    }
                    else{
                        System.out.println(forWithdraw(balance));
                    }
                    break;
                }
            }
            System.out.println("do you want to continue? tyoe 1 if yes otherwise type 0");
             int continu=sc.nextInt();
             if(continu==0)
             {
                break;
             }
        }
    }



    public static int forDeposit(int balance){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter amount for deposit");
        int amount=sc.nextInt();
        balance=balance+amount;
        return balance;
    }
    public static int forWithdraw(int balance)
    {
        System.out.println("enter amount for withdraw");
        Scanner sc= new Scanner(System.in);
        int amount=sc.nextInt();
        if(amount>balance)
        {
            System.out.println("u r out of your reach");
            return 0;
        }
        else{
            balance=balance-amount;
            return balance;
        }
        

    }
    public static void main(String[] args) {
        // calculator();
        atm_machine();
    }
}