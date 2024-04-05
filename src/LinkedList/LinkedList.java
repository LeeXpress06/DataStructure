package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;

    // add at the beginning
    public void append(int value){
        Node node = new Node(value);

        // in case linkedlist is empty
        if(head == null){
            head = node;
            tail = node;


        }
      // linked list is not emplty

      if(head != null){
          node.next = head;
          head = node;

      }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }



}








