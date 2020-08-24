package Railway;
import java.util.*;
import java.io.*;
public class type
{
    int cla;
    public void ty()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("THE TYPE OF CLASS :");
        System.out.println(" ");
        System.out.println("1. AC COACH");
        System.out.println("2. SLEEPER COACH");
        System.out.println("3. NORMAL COACH");
        System.out.println(" ");
        System.out.println("ENTER YOUR CHOICE :");
        cla=in.nextInt();
        if(cla!=1&&cla!=2&&cla!=3)
        {
        System.out.println("INPUT INVALID ,TRY AGAIN");
        ty();
}
}
}