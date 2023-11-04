package Training_novo.oneD_array_ques;

import java.util.Arrays;

public class AnagramProb {
    public static boolean anagram(String str1,String str2){
        //1st approach is hashmap

        //2nd approach is convert it into char array
        if(str1.length()!=str2.length()){
            return false;
        }
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char char1[]=str1.toCharArray();
        char char2[]=str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        for(int i=0;i<char1.length/2;i++){
            if(char1[i]!=char2[i]){
                return false;
            }
        }
        return true;

    }  
 

    public static void main(String[] args) {
        int arr[]={2,4,3,6,4,5,6,7,8,9};
        System.out.println(anagram("hello babes","hello babes"));
        }
}
