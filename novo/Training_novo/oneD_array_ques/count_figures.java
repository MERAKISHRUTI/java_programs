package Training_novo.oneD_array_ques;

import java.util.HashMap;

public class count_figures {
    public static void countFigures(int []arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        //traversing through hasgmap
        for(HashMap.Entry<Integer,Integer> mapelem: map.entrySet()){
            System.out.println(mapelem.getKey() +" "+ mapelem.getValue());
        }



    }


    public static void main(String[] args) {
        int arr[]={2,4,3,6,4,5,6,7,8,9};
        countFigures(arr);
}
}
