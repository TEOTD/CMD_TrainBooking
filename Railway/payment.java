package Railway;
import java.util.*;
import java.io.*;
public class payment
{
    int tot,tol,ch;String na,acc,ma,ac;char chr;
    public void cost()
    {
        Scanner in=new Scanner(System.in);
        railway ob=new railway();
        cardtype ob2=new cardtype();
        type ob1=new type();
        System.out.println("THE TYPE OF PAYMENT :");
        System.out.println(" ");
        System.out.println("1. BY CARD");
        System.out.println("2. BY CHEQUE");
        System.out.println(" ");
        System.out.println("ENTER YOUR CHOICE :");
        ch=in.nextInt();
        switch(ch)
        {
        case 1:
        ob2.car();
        break;
        case 2:
            System.out.println("ENTER THE BANK NAME :");
            na=in.next();
            System.out.println("ENTER ACCOUNT NUMBER (11 DIGITS):");
            acc=in.next();
            int z=acc.length();
            if(z==11)
            {
               for(int i=0;i<z;i++)
               {
               chr=acc.charAt(i);
               {
                   int b=(int)chr;
                   if(b>=48&&b<=57)
                   continue;
                   else
                   System.out.println("ACCOUNT NUMBER INVALID ,ENTER ONLY NUMBERS!!!");
                   cost();
               }
            }
        }
        else if(z!=11)
        {
        System.out.println("ACCOUNT NUMBER INVALID ,ENTER CORRECT 11 DIGITS");
        cost();
        }  
        break;
        default:
            System.out.println("WRONG CHOICE!!!");
            cost();
        }
    }
}