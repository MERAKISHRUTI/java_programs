package Training_novo.oneD_array_ques;

import java.util.HashMap;

public class max_count_figures {
    public static void maxCountFigures(int [] arr){
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

            for(HashMap.Entry<Integer,Integer> mapelem: map.entrySet()){
            if(mapelem.getValue()>max){
                max=mapelem.getKey();
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,6,4,5,6,7,8,9};
         maxCountFigures(arr);
}
}
