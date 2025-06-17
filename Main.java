import java.util.*;
class Main
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
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        
    }
}