import java.util.*;
public class Main2
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("enter the elngth of array");
        int n = sin.nextInt();
    	System.out.println("enter the elements");
        int [] a=new int[n];
        int sum = 0;
        for (int i=0;i<a.length;i++)
        {
            a[i] = sin.nextInt();
        }
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]%2==0)
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
