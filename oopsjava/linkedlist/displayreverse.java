package oopsjava.linkedlist;
public class displayreverse 
{

  public static class node
  {
    int data;
    node next;
    node(int data)
    {
      this.data = data;
    }
    static void displayr(node head)
    {
      if(head == null) return;
      displayr(head.next);
      System.out.print(head.data+" ");
    }
    public static int displaylength(node head)
    {
      int count = 0;
      while(head!=null)
      {
        count++;
        head = head.next;
      }
      return count;
    }
    public static void main(String[] args) {
      node a = new node(5);
      node b = new node(6);
      node c = new node(0);
      node d = new node(56);
      node e = new node(44);

      a.next = b;
      b.next = c;
      c.next = d;
      d.next = e;

      displayr(a);
      System.out.println();
      displaylength(a);
    }

  }
  
}

