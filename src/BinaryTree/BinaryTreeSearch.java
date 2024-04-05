package BinaryTree;

public class BinaryTreeSearch {
    private Node root;
    public BinaryTreeSearch( ){
        root = null;
    }
    public void insert( int value){
      insertRec(root, value);
    }
    public Node insertRec(Node root, int value ){
       if(root == null){
           root = new Node(value);
           return root;
       }
       if(root.data > value){
        root =   insertRec(root.left, value);
       }
       if(root.data < value){
        root =   insertRec(root.right, value);
       }

     return root;
    }
    public String remove ( int value){
        Node node = new Node(value);
        removeNode(node);
        return "Removed Successfully";
    }

    private void removeNode(Node node) {







    }


}
