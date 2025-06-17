import java.util.Stack;
class inbuiltstack
{
    public static void main(String args[])
    {
        Stack st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st.pop());
    }
}