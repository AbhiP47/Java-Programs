// insert at beginning

package oopsjava.linkedlist;

public class insertAtStart {

  public static class node{
    int data;
    node next;

    node(int data)
    {
      this.data = data;
    }
  }

  public static class linkedlist{
    node head = null;
    node tail = null;

    void insertatstart(int val)
    {
      node temp = new node(val);
      if(head == null)
      {
        head =  temp;
        tail = temp;

      }
      else
      {
        temp.next = head;
        head = temp;
      }
    }
    void display()
    {
      node temp = head;
      while(temp!= null)
      {
        System.out.print(temp.data+" ");
        temp = temp.next;
      }
    }
    int size()
    {
      node temp = head;
      int count = 0;
      while(temp != null)
      {
        count++;
        temp = temp.next;
      }
      return count;
    }
  }

  public static void main(String[] args) {
   linkedlist ll = new linkedlist();
    ll.insertatstart(6);
    ll.insertatstart(7);
    ll.insertatstart(9);
    ll.insertatstart(98);
    ll.display();
    System.out.println();
    System.out.println(ll.size());
    



    
  }
}
