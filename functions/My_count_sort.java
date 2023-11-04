package functions;

public class My_count_sort {
     public static void main(String[] args) {
        int b[]= {1,2,3,1,2,3,0,0,1,4,5,9};
        int n=b.length;
        int a[]=new int[n];
        int j=0,d=0,val;
        int max=Integer.MIN_VALUE;


        // for(int i=0;i<n;i++){
        //     if(max<b[i]){
        //         max=b[i];
        //     }
        // }


        for(int i=0;i<n;i++){
            int num=b[i];
            a[num]+=1;
        }
        val=a[d];

        for(int i=0;i<val;i++){
            b[j]=d;
            if((i==val-1) && (j<b.length)){
                d++;
                i=d;
                val=a[i];
                while((val==0) && (a.length-1>d)){
                    d++;
                    val=a[d];
                }
                i=-1;
            }
            j++;
        }

        for(int i=0;i<n;i++){
            System.out.print(b[i] +" ");
        }
        
    }
}
