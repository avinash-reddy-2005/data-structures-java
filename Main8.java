import java.util.*;
class Main8
{
    public static void main(String args[])
    {
        int [] a={3,4,5,6,7,1,9};
        System.out.println("enter the number to be searched");
        Scanner sin =new Scanner(System.in);
        int n=sin.nextInt();
        int flag=1;
        for(int i=0; i<a.length;i++)
        {
            if(a[i]==n)
            {
                flag=0;
                System.out.println("found naa janma danyam ayyimndhi");
                break;
            }
           
        }
         if(flag==1)
            System.out.println("not found");
    }
}