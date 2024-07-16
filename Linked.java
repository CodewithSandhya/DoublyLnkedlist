import java.util.*;
class Linked
{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int val)
        {
            data = val;
            next= null;
            prev = null;
        }
    }
    insertion()
    {
        head=null;
        tail=null;
    }
    public void insertbegin(int k)
    {
        Node newnode = new Node(k);
        if(head==null)
        {
            tail = newnode;
        }else
        {
            newnode.next= head;
            head.prev = newnode;
        }
        head = newnode;
    }
    public void display()
    {
        Node temp=head;
        
    }
}
