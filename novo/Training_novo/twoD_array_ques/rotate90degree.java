package Training_novo.twoD_array_ques;

public class rotate90degree {
 
    public static void rotateby90(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][j+2];
                arr[i][j+2]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
        rotateby90(arr);
    }
}
