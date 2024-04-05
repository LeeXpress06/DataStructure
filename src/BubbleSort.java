public class BubbleSort {

    public static void main(String[] args) {

       int [ ] sort = {2,4,1,7,8,4};

          for(int i = 0; i< sort.length ; i++)
             for(int k = 0; k < sort.length;k++){

                 if (sort [k] > sort[k+1] ) {
                         sort[k+1] = sort[k];
                 }


             }
          for(int i : sort){
              System.out.println(i);
          }



    }
}
