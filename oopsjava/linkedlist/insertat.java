//implementation of linked list to inser an element at any given index
// 1-->2-->3-->4
// ll.insertAt(1,7)
// 1-->7-->2-->3-->4
package oopsjava.linkedlist;
public class insertat 
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
  public static class linkedlist
  {
    node head = null;
    node tail = null;

    void insertatend(int val)
    {
      node temp = new node(val);
      if(head == null)
      {
        head = temp;
        tail = temp;
      }
      else
      {
        tail.next = temp;
        tail = temp;
      }
    }
    void insertAtStart(int val)
    {
      node temp = new node(val);
      if(head == null)
      {
        head = temp;
        tail = temp;
      }
      else 
      {
        temp.next = head;
        head = temp;
      }
    }
    void insertAt(int i , int val)
    {
      node temp = new node(val);
      node t ;
      int count = 0;
      t = head;
      if(i==size())
       {
        insertatend(val);
        return;
       }
      if(i==0)
      {
        insertAtStart(val);
        return ;
      }
      if(i<0)
      {
        System.out.println("Warning : invalid index");
        return;
      }
      else
      {
       while(count != i-1)
       {
        t = t.next;
        count++ ;
       }
       temp.next = t.next;
       t.next = temp ;
      }

       
      
    }
    int size()
    {
      int count = 0;
      node t1 = head;
      while(t1!=null)
      {
        count++ ;
        t1 = t1.next ;
      }
      return count;
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
  }

  public static void main(String[] args) 
  {
    {
     linkedlist ll = new linkedlist();
     ll.insertatend(3);
     ll.insertatend(5);
     ll.insertatend(4);
     ll.insertAtStart(1);
     ll.display();
     System.out.println();
     ll.insertAt(4,7);
     ll.display();
     System.out.println();
     System.out.println(ll.tail.data);
    }
  }
}

