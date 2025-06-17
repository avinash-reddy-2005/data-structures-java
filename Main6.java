import java.util.*;
public class Main6
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("enter the elngth of array");
        int n = sin.nextInt();
    	System.out.println("enter the elements");
        int [] a=new int[n];
        for (int i=0;i<a.length;i++)
        {
            a[i] = sin.nextInt();
        }
        int i=0, j=a.length-1;
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i+=1;
            j-=1;

        }
        for (int k=0;k<a.length;k++)
        {
            System.out.println(a[k]);
        }
    }
}
// import java.util.*;
// public class Main6
// {
//     public static void main(String args[])
//     {
//         Scanner sin = new Scanner(System.in);
//         System.out.println("enter the elngth of array");
//         int n = sin.nextInt();
//     	System.out.println("enter the elements");
//         int [] a=new int[n];
//         for (int i=0;i<a.length;i++)
//         {
//             a[i] = sin.nextInt();
//         }
//         int temp;
//         for (int i=0;i<a.length;i++)
//         {
//             for (int j=a.length-1;i<j;j--)
//             {
//                 temp = a[i];
//                 a[i] = a[j];
//                 a[j] = temp;
//             }

//         }
//         for (int k=0;k<a.length;k++)
//         {
//             System.out.println(a[k]);

//         }

//     }
// }
