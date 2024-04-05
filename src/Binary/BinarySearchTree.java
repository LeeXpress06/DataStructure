package Binary;

public class BinarySearchTree {
    private Node root;


    public void insert(int value){
        root = insertHelper(root,value);
    }

    private Node insertHelper(Node root, int value) {
        if(root == null){
            return new Node(value);
        }
       if(value < root.value){
           return insertHelper(root.left, value);
       }
       else if(value> root.value) {
           return insertHelper(root.right, value);
       }
      return  root;

    }




}
