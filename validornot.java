import java.util.Stack;
import java.util.*;
public class validornot
{
    public static void main(String args[])
    {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            {
                st.push(ch);
            }
            else
            {
                if((ch==')' && st.pop()!='(') || (ch==']' && st.pop()!='[') || (ch=='}' && st.pop()!='{')) continue;
                else{
                    System.out.println("valid");
                    System.exit(0);
                }
            }
        }
        System.out.println("not valid");
    }
    
}
