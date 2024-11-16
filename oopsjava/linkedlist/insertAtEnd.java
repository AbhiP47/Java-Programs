package oopsjava.linkedlist;

public class insertAtEnd 
{
  public static class node
  {
    int data;
    node next;
    node(int data)
    {
      this.data = data;
    }
    

  }
  public static class linkedlistt
  {
    node head = null;
    node tail = null;

  void insertatend(int val)
  {
    node temp = new node(val);
    if(head == null)
    {
      head = temp;
    }
    else
    {
      tail.next = temp;
    }
    tail = temp;
  }
  void display()
  {
   node temp = head;
    while(temp != null)
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
      temp = temp.next;
      count++;
    }
    return count;
  }
  }


  public static void main(String[] args)
  {
    linkedlistt ll = new linkedlistt();
    ll.insertatend(5);
    ll.insertatend(6);
    ll.insertatend(7);

    ll.display();
    System.out.println();
    System.out.println(ll.size());
  }
}
