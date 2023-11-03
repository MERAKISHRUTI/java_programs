package functions;


public class Print {
    static int count=0;
    public static void printDitgit(int num)
    {
         if(num==1)
    {
        System.out.println(1);
        return;
    }
    
      printDitgit(num-1);
      System.out.println(num);
    
    
    }

    public static void evenNumber(int num)
        {
         if(num==1)
         {
        return;
         } 
         
         if(num%2==0)
        {
        System.out.println(num);
        }
        evenNumber(num-1);
        return;
         
        }

        public static void printNoDigit(int num){
            if(num==0){
                return ;
            }
            int n=num%10;
            num=num/10;
            printNoDigit(num);
            System.out.println(n);
        }

        public static int countDigits(int num){
            if(num==0){
                return count;
            }
            num=num/10;
            count++;
            return countDigits(num);
            
        }

        public static boolean primeNumbers(int num,int i){
            if(i==num){
                return true; 
            }
            if(num%i==0){
                return false;
            }
            return primeNumbers(num,i+1);
        }

        public static int primeNumbersRange(int num,int i){
            if(i==num){
                return 1; 
            }
            if(num%i==0){
                System.out.println(i);
            }
            return primeNumbersRange(num,i+1);
        }

        //not proper
        public static void pattern1(int i,int j){
            if(j==0){
                return;
            }
            System.out.print("*");
            pattern1(j-1,i);
        }
         public static void pattern11(int i,int j){
            if(i==1){
                return;
            }
            pattern1(i,j);
            System.out.println();
            pattern11(i-1, j);
         }
        

        public static void main(String[] args) {
        // printDitgit(10);
        // evenNumber(10);
        // printNoDigit(1234);
        // System.out.println(countDigits(1234));
        // System.out.println(primeNumbers(17,2));
        // primeNumbersRange(20,2);
        pattern11(5,5);
    }
   

}
