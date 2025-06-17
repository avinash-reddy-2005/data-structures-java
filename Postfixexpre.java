import java.util.Stack;
import java.util.*;
public class Postfixexpre {
    public static void main(String args[])
    {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        for (int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
            {
                st.push(Character.getNumericValue(ch));
            }
            else
            {
                int b = st.pop();
                int a = st.pop();
                if(ch=='+') st.push(a+b);
                else if(ch=='-') st.push(a-b);
                else if(ch=='*') st.push(a*b);
                else if(ch=='/') st.push(a/b);
            }
        }
        System.out.println(st.pop());
    }
}
