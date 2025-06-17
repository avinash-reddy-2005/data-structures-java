import java.util.Stack;
import java.util.*;
public class reversinbystack {
    public static void main(String args[])
    {
        Stack st = new Stack<>();
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            st.push(ch);
        }
        String a = "";
        for(int i=0; i<s.length(); i++)
        {
            a+=st.pop();
        }
        System.out.println(a);
    }
}
