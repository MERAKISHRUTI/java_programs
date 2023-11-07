package Training_novo.oneD_array_ques;

public class leaders_problem {
    public static int leadersProb(int num[]){
        //1st approach
        //O(n2) nested for loop
        //2nd approch
        int max=Integer.MIN_VALUE;
        for(int i=num.length-1;i>0;i--){
            if(max<num[i]){
                max=num[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={2,4,3,6,4,5,6,7,8,9};
         System.out.println(leadersProb(arr));
}
}
