package AVLtree;

public class Node {
    int key;
    Node right;
    Node left;
    int height;

    public Node(int key){
        this.key = key;
        height = 1;
    }


}
