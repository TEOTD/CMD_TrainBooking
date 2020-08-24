package Railway;  
import java.io.*;
import java.util.*;
public class date
{ 
int yy,mm,dd,md,mmst,ddst;int ddd;
boolean f; 
public void displ()
{ 
Calendar c=Calendar.getInstance();
Scanner in=new Scanner(System.in);
for(;;)
{
System.out.println("PLEASE ENTER YEAR OF JOURNEY (in numbers) :");
yy=in.nextInt();
System.out.println("PLEASE ENTER MONTH OF JOURNEY(in numbers) :");
mm=in.nextInt();
System.out.println("PLEASE ENTER DAY OF JOURNEY  (in numbers) :");
dd=in.nextInt();
System.out.println("Today is :"+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
mmst=c.get(Calendar.MONTH)+1;
md=mm-mmst;
ddst=c.get(Calendar.DATE);
ddd=(dd-ddst)+md*30;
System.out.println("Differ date :"+ddd+" days.");
System.out.println("Requested date is :"+dd+"/"+mm+"/"+yy);
if(ddd>=60||ddd<1)
{
System.out.println("Not possible before 60 days or before current date , re enter new date");
}
else
{
System.out.println("VALID DATE...NOW CHECK THE VACANT BERTH");
break;
}
} 
}
}