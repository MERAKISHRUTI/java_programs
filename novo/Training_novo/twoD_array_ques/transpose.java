package Training_novo.twoD_array_ques;

public class transpose {
    public static void Transpose(int[][] num){
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num[i].length;j++){
                int temp=num[i][j];
                num[i][j]=num[j][i];
                num[j][i]=temp;            }
        }
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
        Transpose(arr);
    }
}
