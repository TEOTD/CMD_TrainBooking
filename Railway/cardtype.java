package Railway;
import java.util.*;
import java.io.*;
public class cardtype
{
    int choice;String ma,ac,pin;char chr,chr1,chr2,chr3;
    public void car()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("THE TYPE OF CARD :");
        System.out.println(" ");
        System.out.println("1. BY CREDIT CARD");
        System.out.println("2. BY DEBIT CARD");
        System.out.println(" ");
        System.out.println("ENTER YOUR CHOICE :");
        choice=in.nextInt();
        if((choice>=3)&&(choice<=0))
        {
            System.out.println("WRONG CHOICE,RE ENTER CORRECT CHOICE!!!");
            car();
        }
        
            System.out.println("ENTER THE BANK NAME :");
            ma=in.next();
            System.out.println("ENTER CARD NUMBER (15 DIGITS):");
            ac=in.next();
            System.out.println("ENTER CARD PIN (4 DIGITS):");
            pin=in.next();
            int v=ac.length();
            int q=pin.length();
            if(v!=15)
            {
                System.out.println("CARD NUMBER INVALID ,ENTER CORRECT 15 DIGITS");
                car();
            }
            if(q!=4)
            {
                System.out.println("CARD PIN INVALID ,ENTER CORRECT 4 DIGITS");
                car();
            }
            for(int i=0;i<v;i++)
            {
                chr=ac.charAt(i);
                {
                   int b=(int)chr;
                   if(b>=48&&b<=57)
                   continue;
                   else
                   System.out.println("ACCOUNT NUMBER INVALID ,ENTER ONLY NUMBERS!!!");
                   car();
                }
            }
            for(int k=0;k<q;k++)
            {
                chr1=ac.charAt(k);
                {
                   int c=(int)chr1;
                   if(c>=48&&c<=57)
                   continue;
                   else
                   System.out.println("CARD PIN INVALID ,ENTER ONLY NUMBERS!!!");
                   car();
                }
            }
    }
}