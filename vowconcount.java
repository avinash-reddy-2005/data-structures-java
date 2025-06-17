// import java.util.*;
// public class vowconcount
// {
//     public static void main(String args[])
//     {
//         Scanner sin = new Scanner(System.in);
//         System.out.println("enter the string");
//         String a =sin.nextLine().toLowercase();
//         String vowels=
//         int vow=0,con=0,others=0;
//         for(int i=0; i<a.length(); i++)
//         {
//             char ch = a.charAt(i);
//             for (int j=0; j<special.length(); j++)
//             {
//                 char ch1=special.charAt(j);
//                 char ch2=vowels.charAt(j);
//                 if(ch==ch2)
//                 vow+=1;
//                 else if(ch!=ch1)
//                 con+=1;
//                 else
//                 others+=1;

//             }
            
//         }
//         System.out.println("vowels count = "+vow);
//         System.out.println("consonants count = "+con);
//         System.out.println("specials count = "+others);

//     }
    
// }


import java.util.*;
public class vowconcount {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);

        System.out.println("Enter the string:");
        String a = sin.nextLine().toLowerCase(); 

        String vowels = "aeiou";
        int vow = 0, con = 0, others = 0;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1)
                    vow++;
                else
                    con++;
            } else if (ch != ' ') {
                others++;
            }
        }

        System.out.println("Vowels count = " + vow);
        System.out.println("Consonants count = " + con);
        System.out.println("Special characters count = " + others);
        sin.close();
    }
}
