import java.util.*;
public class removewhitespaces 
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("enter the string");
        String a = sin.nextLine();
        String b="";
        for (int i=0; i<a.length(); i++)
        {
            char ch = a.charAt(i);
            if(ch!=' ')
                b+=ch;
        }
        System.out.println(b);
    }
    
}