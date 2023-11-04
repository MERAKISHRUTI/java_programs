package Training_novo.twoD_array_ques;

public class panagram {
    
    public static void pangram(String str){
        int sum=0;
        for(char i='a';i<27;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    
    
    public static void main(String[] args) {
       pangram("ff");
    }
}
