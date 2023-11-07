package Training_novo.oneD_array_ques;

public class reverse_String {
    public static void reverseString(String str){
        //1st approach
        String ans="";
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            ans=a+ans;
        }
        System.out.println(ans);

        //2nd approach CharArray()
    }

    public static void main(String[] args) {
        int arr[]={2,4,3,6,4,5,6,7,8,9};
        reverseString("hello");
    }
}
