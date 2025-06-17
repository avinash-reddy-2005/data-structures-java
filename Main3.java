import java.util.*;
public class Main3 
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
        int temp=a[0];
        for(int i = 0;i<a.length; i++)
        {
            if(a[i]>temp)
            temp=a[i];
        }
        System.out.println("max number"+temp);
    }
}
