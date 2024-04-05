package BinaryTree;

public class Fibbonaci {

    public static void main(String[] args) {
        int n = 5;
       recursionFibonaci(1, 2,1);
        
    }
    public static void fibonacciCalculation(int value){
        int first = 1;
        int second =2;
        int result = 0;
        System.out.println(first);
        System.out.println(second);
        
        for(int i = 0; i<10; i++){
            result = first + second;
            System.out.println(result);
            first = second;
            second = result;
        }

    }
   public static  void recursionFibonaci(int first, int second, int count){

         if(count <7) {
             int result = first + second;
             System.out.println(result);
             count++;
             recursionFibonaci(second, result,count);
         }
         else  {
             System.out.println("The calculation is done");
         }
   }
}
