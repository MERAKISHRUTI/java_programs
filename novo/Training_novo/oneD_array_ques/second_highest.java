package Training_novo.oneD_array_ques;

public class second_highest {
    public static int secondHighest(int[] num){
        //1)sort
        //2)
        int max=Integer.MIN_VALUE,secondMax=0;
        for(int i=0;i<num.length;i++){
            if(max<num[i]){
                secondMax=max;
                max=num[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int arr[]={2,4,3,6,4,5,6,7,8,9};
        System.out.println(secondHighest(arr));
    }
}
