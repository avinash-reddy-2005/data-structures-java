// import java.util.*;
// public class Rversingstring {
//     public static void main(String args[])
//     {
//         Scanner sin = new Scanner (System.in);
//         String a=sin.nextLine();
//         String b="";
//         for (int i=a.length()-1; i>=0; i--)
//         {
//             b+=a.charAt(i);

//         }
//         System.out.println(b);

//     }
// }
public class Rversingstring {
    public static void main(String[] args) {
        String a = "avinash";
        String reversed = new StringBuilder(a).reverse().toString();
        System.out.println(reversed);
    }
}
