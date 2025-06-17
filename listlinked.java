class Node
{
    int data;
    Node next;
    Node (int n)
    {
        this.data=n;
        this.next=null;
    }
}

public class listlinked 
{
    public static void main(String args[])
    {
        Node a = new Node(1);
        Node b = new Node(2);
        a.next=b;
        System.out.println(a.data);
        System.out.println(a.next.data);

    }
    
}
