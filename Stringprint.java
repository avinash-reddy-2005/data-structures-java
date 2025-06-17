// public class stringprinting {
//     public static void main(String args[])
//     {
//         String a="avinash";
//         System.out.println(a);
//     }
// }
import java.util.*;
class stringprinting
{
    public static void main(String args[])
    {
        Scanner sin =  new Scanner(System.in);
        String a=sin.nextLine();
        for (int i=0;i<a.length();i++)
        {
            System.out.print(a.charAt(i));
        }
    }
}