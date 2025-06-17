import java.util.*;
public class countcharacters
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner (System.in);
        System.out.println("enter the string");
        String a = sin.nextLine();
        int count=0;
        char x = sin.next().charAt(0);
        for(int i=0; i<a.length(); i++)
        {
            char ch = a.charAt(i);
            if(ch==x)
            count+=1;
        }
        System.out.println(count);
    }
    
}
