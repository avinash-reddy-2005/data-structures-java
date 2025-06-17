class Node
{
    int data;
    Node next;
    Node (int data)
    {
        this.data=data;
        this.next=null;

    }
}
class linkedlist
{
    Node head=null;
    void add(int n)
    {
        Node newnode=new Node(n);
        if(head==null) head = newnode;
        else 
        {
            Node cur=head;
            while(cur.next!=null)
            {
                cur=cur.next;
            }
            head.next=newnode;
        }

    }
    void display()
    {
        Node cur=head;
        while(cur!=null)
        {
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
}

public class automatelinklist 
{
    public static void main(String args[])
    {
        linkedlist l = new linkedlist();
        l.add(10);
        l.display();

    }
    
}
