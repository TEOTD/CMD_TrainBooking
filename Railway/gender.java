package Railway;
import java.util.*;
import java.io.*;
public class gender
{
    int ch;String g;
    public void gen()
    {
        Scanner in=new Scanner(System.in);
        railway ob=new railway();
        for(int p=0;p<ob.N;p++)
        {
        System.out.print("FOR PERSON NUMBER "+(p+1));
        System.out.print("ENTER 1 FOR MALE");
        System.out.print("ENTER 2 FOR FEMALE");
        System.out.print("Enter choice :");
        ch=in.nextInt();      
        if(ch!=1&&ch!=2)
        {
            System.out.print("WRONG CHOICE,RE ENTER CORRECT CHOICE");
            gen();
        }
        if(ch==1)
        g="Male";
        else
        g="Female";
    }
}
}