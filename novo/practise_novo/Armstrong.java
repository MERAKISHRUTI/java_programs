import java.util.*;
 class Armstrong {
    
    public static void arm(int num){
        int sum=0,store=num;
        while(num!=0){
            int value=num%10;
            sum=sum+(int)Math.pow(value, 3);
            num=num/10;
        }
        if(sum==store){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
    public static void main(String[] args) {
        arm(153);
    }
}
