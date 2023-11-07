public class Palindrome {
    public static boolean palindromee(int num){
        int rev=0, rep=num;
        while(num!=0){
            rev=rev*10 + (num%10);
            num=num/10;
        }
        if(rev==rep){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        palindromee(1221);
    }
}
