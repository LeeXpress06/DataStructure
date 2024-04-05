public class Recursion {

    public static void printrecursion(int value){
        if(value == 0) return ;

        printrecursion(value-1);
        System.out.println(value);
    }

    public static void main(String[] args) {

        printrecursion(5);
    }
}
