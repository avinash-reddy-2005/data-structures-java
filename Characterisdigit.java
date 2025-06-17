import java.util.*;
public class Characterisdigit 
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner (System.in);
        String a=sin.nextLine();
        for(int i=0; i<a.length(); i++)
        {
            if(Character.isDigit(a.charAt(i)))
            {
                System.out.println("digits");
                System.exit(0);
            }
        }
        System.out.println("not digits");
    }
}
