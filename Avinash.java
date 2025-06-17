class Stack
{
    int [] a = new int[5];
    int top=-1;
    void push(int i)
    {
        if(top==a.length-1) System.out.println("stack is full");
        else 
        {
            top++;
            a[top]=i;
            
        }

    }
    void pop()
    {
        if(top==-1) System.out.println("Stack is empty");
        else 
        {
            System.out.println("deleted element is "+a[top]);
            top--;
        }

    }
    void peek()
    {
        if(top==-1) System.out.println("stack is empty");
        else
        {
            System.out.println("peek element is " + a[top]);
        }

    }
    void display()
    {
        System.out.println("elements are");
        for(int i=0; i<=top; i++)
        {
            System.out.println(a[i]);
        }

    }
}


public class Avinash
{
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
    }
}