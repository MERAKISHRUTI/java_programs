package Training_novo.oneD_array_ques;

public class peak_elem {
    public static int peakElem(int nums[]){
        //1st approach
        // for(int i=0;i<nums.length;i++){
        //     if((i==0 || nums[i]>nums[i-1]) && (i==nums.length-1 || nums[i+1]<nums[i])){
        //         return i;
        //     }
        // }
        // return -1;


        //2nd approach
        int n=nums.length;
        if(nums.length==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        int low=1,high=n-2;
        while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                return mid;
            }
            if(nums[mid]>nums[mid+1]){
                low=mid+1;
            }
            if(nums[mid]<nums[mid-1]){
                high=mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={2,4,3,6,4,5,6,7,8,9};
        System.out.println(peakElem(arr));
}
}
