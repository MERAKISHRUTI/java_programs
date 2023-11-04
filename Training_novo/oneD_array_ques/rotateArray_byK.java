package Training_novo.oneD_array_ques;

public class rotateArray_byK {
    public static void rotate_Array_by_k(int []arr,int n){
        //1st approach O(n*k)
        // n=n%arr.length;
        // while(n!=0){
        //     int store=arr[0];
        //     for(int i=0;i<arr.length-1;i++){
        //         arr[i]=arr[i+1];

        //     }
        //     arr[n-1]=store;
        //     n--;
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        //2nd approach O(n)
        n=n%arr.length;
         int store=arr[0];
            for(int i=0;i<arr.length-1 && n!=0;i++){
                arr[i]=arr[i+1];
                if(i==arr.length-2){
                    arr[arr.length-1]=store;
                    n--;
                    i=-1;
                    store=arr[0];
                }

            }
       
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

       
    }

    public static void main(String[] args) {
        int arr[]={2,4,3,6,4,5,6,7,8,9};
        
         rotate_Array_by_k(arr,10);
}
}
