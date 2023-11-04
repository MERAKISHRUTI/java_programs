package Training_novo.oneD_array_ques;

import java.util.Arrays;

public class ZigZag {
     public static void zig_Zag(int []arr){
        Arrays.sort(arr);
        for(int i=1;i<arr.length-2;i=i+2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]={2,4,3,6,4,5,6,7,8,9};
        zig_Zag(arr);
}

}