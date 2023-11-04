package practise_novo;

public class practise {
 
    public static boolean palindrome(int num){
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

    // public static boolean stringPalindrome(String str){

    // }

    public static void main(String[] args) {
        // System.out.println(palindrome(10011));
        // System.out.println(stringPalindrome("hello"));
    }
}
