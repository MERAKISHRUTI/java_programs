public class Magical_no {
    
    public static void magicalNo(int num){
        int sum=0;
        
        while(sum>9 || num>0){
            if(num==0){
                num=sum;
                sum=0;

            }
            int no=num%10;
            sum=sum+no;
            num=num/10;
        }
        if(sum==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
    public static void main(String[] args) {
        magicalNo(1234);
    }
}
