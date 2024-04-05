package Pattern;

public class Recursion {

    public static void main(String[] args) {

        love(3);




    }

public static void love ( int value ){

        if(value == 0) return;
    System.out.println("Shiblee + Orthee");

    love(value-1);

  }

}
