class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class linkedlist1
{
    Node head=null;
    void addlast(int n)
    {
        Node newnode = new Node(n);
        if(head==null) head=newnode;
        else
        {
            Node cur=head;
            while(cur.next!=null)
            {
                cur=cur.next;
            }
            cur.next=newnode;
        }
    }
    void addfront(int n)
    {
        Node newnode = new Node(n);
        newnode.next=head;
        this.head=newnode;
    }
    void deletefirst()
    {
        this.head=head.next;
    }
    void deletelast()
    {
        Node cur = head;
        while((cur.next.next)!=null)
        {
            cur=cur.next;
        }
        cur.next=null;
    }
    void display()
    {
        Node cur = head;
        while(cur!=null)
        {
            System.out.println(cur.data);
            cur=cur.next;
        }
        System.out.println("null");
    }
}

public class linkedlist 
{
    public static void main(String[] args)
    {
        linkedlist1 l = new linkedlist1();
        l.addlast(1);
        l.addlast(2);
        l.addlast(3);
        l.addlast(36);
        l.addlast(6);
        l.deletelast();
        l.display();
    }
    
}
