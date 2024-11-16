//displaying linked list using a recursive function
package oopsjava.linkedlist;
public class displayll {
  public static class Node
  {
    int data;
    Node next;
    Node(int data)
    {
      this.data = data;
    }
    static void displayr(Node head)
    {
      if(head == null) return;
      System.out.print(head.data+" ");
      displayr(head.next);
    }
    public static void main(String[] args) {
      Node a = new Node(5);
      Node b = new Node(6);
      Node c = new Node(0);
      Node d = new Node(56);
      Node e = new Node(44);

      a.next = b;
      b.next = c;
      c.next = d;
      d.next = e;

      displayr(a);
    }

  }
  
}
