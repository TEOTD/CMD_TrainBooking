package Railway;
import java.util.*;
import java.io.*;
public class railwaydisplay extends date
{
int row,col;
public void display()throws IOException
{ 
Calendar c=Calendar.getInstance();
Scanner in=new Scanner(System.in);
railway ob=new railway();
payment ob2=new payment();
type ob3=new type();
age ob4=new age();
gender ob5=new gender();
cardtype ob6=new cardtype();
System.out.println("                                                                  ***************WELCOME TO INDIAN RAILWAYS***************                                                                        ");
System.out.println("   ");
for(;;)
{
displ();
ob.input();
if(ob.train>11)
{
    System.out.println("WRONG CHOICE ,ENTER AGAIN!!!");
    ob.input();
}
railrev ob1=new railrev();
System.out.println(" ");
ob3.ty();
System.out.println(" ");
System.out.println("SEE THE VACANT POSITION AND THEN BOOK THE BERTH");
System.out.println(" ");
ob1.disp();
System.out.println("\nENTER ROW NUMBER OF BERTH :");
row=in.nextInt();
System.out.println("ENTER COLUMN NUMBER OF BERTH :");
col=in.nextInt();
ob1.check(row,col);
System.out.println("");
ob2.cost();
System.out.println("\f");
System.out.println("_________________________________________________________________");
System.out.println("INFORMATION :");
System.out.println(" ");
for(int i=0;i<ob.N;i++)
{
System.out.println(i+1+".)"+"NAME :"+ob.name[i]+", AGE :"+ob.age[i]+", GENDER :"+ob.gen[i]);
}
System.out.println("_________________________________________________________________");
System.out.println(" ");
if(ob.train==1)
{
System.out.println("DATE OF JOURNEY :"+dd+"/"+mm+"/"+yy);
System.out.println("TRAIN NAME      :Agra Express");
System.out.println("DESTINATION     :Agra");
if(ob.cho==1)
System.out.println("DEPARTURE FROM  :Ahmedabad");
if(ob.cho==2)
System.out.println("DEPARTURE FROM  :Bangalore");
if(ob.cho==3)
System.out.println("DEPARTURE FROM  :Bhopal");
if(ob.cho==4)
System.out.println("DEPARTURE FROM  :Bhubaneshwar");
if(ob.cho==5)
System.out.println("DEPARTURE FROM  :Chennai");
if(ob.cho==6)
System.out.println("DEPARTURE FROM  :Coimbatore");
if(ob.cho==7)
System.out.println("DEPARTURE FROM  :Delhi");
if(ob.cho==8)
System.out.println("DEPARTURE FROM  :Hyderabad");
if(ob.cho==9)
System.out.println("DEPARTURE FROM  :Howrah");
}
else if(ob.train==2)
{
System.out.println("TRAIN NAME      :Ahmedabad Express");
System.out.println("DATE OF JOURNEY :"+dd+"/"+mm+"/"+yy);
System.out.println("DESTINATION     :Ahmedabad");
if(ob.cho==1)
System.out.println("DEPARTURE FROM  :Agra");
if(ob.cho==2)
System.out.println("DEPARTURE FROM  :Bangalore");
if(ob.cho==3)
System.out.println("DEPARTURE FROM  :Bhopal");
if(ob.cho==4)
System.out.println("DEPARTURE FROM  :Bhubaneshwar");
if(ob.cho==5)
System.out.println("DEPARTURE FROM  :Chennai");
if(ob.cho==6)
System.out.println("DEPARTURE FROM  :Coimbatore");
if(ob.cho==7)
System.out.println("DEPARTURE FROM  :Delhi");
if(ob.cho==8)
System.out.println("DEPARTURE FROM  :Hyderabad");
if(ob.cho==9)
System.out.println("DEPARTURE FROM  :Howrah");
}
else if(ob.train==3)
{
System.out.println("TRAIN NAME      :Bangalore Express");
System.out.println("DATE OF JOURNEY :"+dd+"/"+mm+"/"+yy);
System.out.println("DESTINATION     :Bangalore");
if(ob.cho==1)
System.out.println("DEPARTURE FROM  :Agra");
if(ob.cho==2)
System.out.println("DEPARTURE FROM  :Ahmadabad");
if(ob.cho==3)
System.out.println("DEPARTURE FROM  :Bhopal");
if(ob.cho==4)
System.out.println("DEPARTURE FROM  :Bhubaneshwar");
if(ob.cho==5)
System.out.println("DEPARTURE FROM  :Chennai");
if(ob.cho==6)
System.out.println("DEPARTURE FROM  :Coimbatore");
if(ob.cho==7)
System.out.println("DEPARTURE FROM  :Delhi");
if(ob.cho==8)
System.out.println("DEPARTURE FROM  :Hyderabad");
if(ob.cho==9)
System.out.println("DEPARTURE FROM  :Howrah");
}
else if(ob.train==4)
{
System.out.println("TRAIN NAME      :Bhopal Express");
System.out.println("DATE OF JOURNEY :"+dd+"/"+mm+"/"+yy);
System.out.println("DESTINATION     :Bhopal");
if(ob.cho==1)
System.out.println("DEPARTURE FROM  :Agra");
if(ob.cho==2)
System.out.println("DEPARTURE FROM  :Ahmadabad");
if(ob.cho==3)
System.out.println("DEPARTURE FROM  :Bangalore");
if(ob.cho==4)
System.out.println("DEPARTURE FROM  :Bhubaneshwar");
if(ob.cho==5)
System.out.println("DEPARTURE FROM  :Chennai");
if(ob.cho==6)
System.out.println("DEPARTURE FROM  :Coimbatore");
if(ob.cho==7)
System.out.println("DEPARTURE FROM  :Delhi");
if(ob.cho==8)
System.out.println("DEPARTURE FROM  :Hyderabad");
if(ob.cho==9)
System.out.println("DEPARTURE FROM  :Howrah");
}
else if(ob.train==5)
{
System.out.println("TRAIN NAME      :Bhubaneswar Express");
System.out.println("DATE OF JOURNEY :"+dd+"/"+mm+"/"+yy);
System.out.println("DESTINATION     :Bhubaneswar");
if(ob.cho==1)
System.out.println("DEPARTURE FROM  :Agra");
if(ob.cho==2)
System.out.println("DEPARTURE FROM  :Ahmadabad");
if(ob.cho==3)
System.out.println("DEPARTURE FROM  :Bangalore");
if(ob.cho==4)
System.out.println("DEPARTURE FROM  :Bhopal");
if(ob.cho==5)
System.out.println("DEPARTURE FROM  :Chennai");
if(ob.cho==6)
System.out.println("DEPARTURE FROM  :Coimbatore");
if(ob.cho==7)
System.out.println("DEPARTURE FROM  :Delhi");
if(ob.cho==8)
System.out.println("DEPARTURE FROM  :Hyderabad");
if(ob.cho==9)
System.out.println("DEPARTURE FROM  :Howrah");
}
else if(ob.train==6)
{
System.out.println("TRAIN NAME      :Chennai Express");
System.out.println("DATE OF JOURNEY :"+dd+"/"+mm+"/"+yy);
System.out.println("DESTINATION     :Chennai");
if(ob.cho==1)
System.out.println("DEPARTURE FROM  :Agra");
if(ob.cho==2)
System.out.println("DEPARTURE FROM  :Ahmadabad");
if(ob.cho==3)
System.out.println("DEPARTURE FROM  :Bangalore");
if(ob.cho==4)
System.out.println("DEPARTURE FROM  :Bhopal");
if(ob.cho==5)
System.out.println("DEPARTURE FROM  :Bhubaneshwar");
if(ob.cho==6)
System.out.println("DEPARTURE FROM  :Coimbatore");
if(ob.cho==7)
System.out.println("DEPARTURE FROM  :Delhi");
if(ob.cho==8)
System.out.println("DEPARTURE FROM  :Hyderabad");
if(ob.cho==9)
System.out.println("DEPARTURE FROM  :Howrah");
}
else if(ob.train==7)
{
System.out.println("TRAIN NAME      :Coimbatore Express");
System.out.println("DATE OF JOURNEY :"+dd+"/"+mm+"/"+yy);
System.out.println("DESTINATION     :Coimbatore");
if(ob.cho==1)
System.out.println("DEPARTURE FROM  :Agra");
if(ob.cho==2)
System.out.println("DEPARTURE FROM  :Ahmadabad");
if(ob.cho==3)
System.out.println("DEPARTURE FROM  :Bangalore");
if(ob.cho==4)
System.out.println("DEPARTURE FROM  :Bhopal");
if(ob.cho==5)
System.out.println("DEPARTURE FROM  :Bhubaneshwar");
if(ob.cho==6)
System.out.println("DEPARTURE FROM  :Chennai");
if(ob.cho==7)
System.out.println("DEPARTURE FROM  :Delhi");
if(ob.cho==8)
System.out.println("DEPARTURE FROM  :Hyderabad");
if(ob.cho==9)
System.out.println("DEPARTURE FROM  :Howrah");
}
else if(ob.train==8)
{
System.out.println("TRAIN NAME      :Delhi Express");
System.out.println("DATE OF JOURNEY :"+dd+"/"+mm+"/"+yy);
System.out.println("DESTINATION     :Delhi");
if(ob.cho==1)
System.out.println("DEPARTURE FROM  :Agra");
if(ob.cho==2)
System.out.println("DEPARTURE FROM  :Ahmadabad");
if(ob.cho==3)
System.out.println("DEPARTURE FROM  :Bangalore");
if(ob.cho==4)
System.out.println("DEPARTURE FROM  :Bhopal");
if(ob.cho==5)
System.out.println("DEPARTURE FROM  :Bhubaneshwar");
if(ob.cho==6)
System.out.println("DEPARTURE FROM  :Chennai");
if(ob.cho==7)
System.out.println("DEPARTURE FROM  :Coimbatore");
if(ob.cho==8)
System.out.println("DEPARTURE FROM  :Hyderabad");
if(ob.cho==9)
System.out.println("DEPARTURE FROM  :Howrah");
}
else if(ob.train==9)
{
System.out.println("TRAIN NAME      :Hyderabad Express");
System.out.println("DATE OF JOURNEY :"+dd+"/"+mm+"/"+yy);
System.out.println("DESTINATION     :Hyderabad");
if(ob.cho==1)
System.out.println("DEPARTURE FROM  :Agra");
if(ob.cho==2)
System.out.println("DEPARTURE FROM  :Ahmadabad");
if(ob.cho==3)
System.out.println("DEPARTURE FROM  :Bangalore");
if(ob.cho==4)
System.out.println("DEPARTURE FROM  :Bhopal");
if(ob.cho==5)
System.out.println("DEPARTURE FROM  :Bhubaneshwar");
if(ob.cho==6)
System.out.println("DEPARTURE FROM  :Chennai");
if(ob.cho==7)
System.out.println("DEPARTURE FROM  :Coimbatore");
if(ob.cho==8)
System.out.println("DEPARTURE FROM  :Delhi");
if(ob.cho==9)
System.out.println("DEPARTURE FROM  :Howrah");
}
else if(ob.train==10)
{
System.out.println("TRAIN NAME      :Howrah Express");
System.out.println("DATE OF JOURNEY :"+dd+"/"+mm+"/"+yy);
System.out.println("DESTINATION     :Howrah");
if(ob.cho==1)
System.out.println("DEPARTURE FROM  :Agra");
if(ob.cho==2)
System.out.println("DEPARTURE FROM  :Ahmadabad");
if(ob.cho==3)
System.out.println("DEPARTURE FROM  :Bangalore");
if(ob.cho==4)
System.out.println("DEPARTURE FROM  :Bhopal");
if(ob.cho==5)
System.out.println("DEPARTURE FROM  :Bhubaneshwar");
if(ob.cho==6)
System.out.println("DEPARTURE FROM  :Chennai");
if(ob.cho==7)
System.out.println("DEPARTURE FROM  :Coimbatore");
if(ob.cho==8)
System.out.println("DEPARTURE FROM  :Delhi");
if(ob.cho==9)
System.out.println("DEPARTURE FROM  :Hyderabad");
}
if(ob3.cla==1)
System.out.println("TYPE OF CLASS   :AC CLASS");
if(ob3.cla==2)
System.out.println("TYPE OF CLASS   :SLEEPER CLASS");
if(ob3.cla==3)
System.out.println("TYPE OF CLASS   :NORMAL CLASS");
if(ob3.cla!=1&&ob3.cla!=2&&ob3.cla!=3)
System.out.println("INPUT INVALID");
System.out.println("COACH NUMBER    :"+ob.code);
System.out.println("-----------------------------------------------------------------");
System.out.println(" ");
System.out.println("PAYMENT :");
System.out.println(" ");
if(ob3.cla==1)
System.out.println("GRAND TOTAL :Rs"+ob.N*2500);
if(ob3.cla==2)
System.out.println("GRAND TOTAL :Rs"+ob.N*1500);
if(ob3.cla==3)
System.out.println("GRAND TOTAL :Rs"+ob.N*1000);
if(ob2.ch==1) 
{
System.out.println(" ");
if(ob6.choice==1)
{
System.out.println("CARD TYPE :CREDIT CARD");
System.out.println("BANK NAME :"+ob6.ma);
System.out.println("ACCOUNT NUMBER :"+ob6.ac);
System.out.println("PIN CODE :"+ob6.pin);
if(ob3.cla==1)
System.out.println("TOTAL COST :Rs."+ob.N*2500);
if(ob3.cla==2)
System.out.println("TOTAL COST :Rs."+ob.N*1500);
if(ob3.cla==3)
System.out.println("TOTAL COST :Rs."+ob.N*1000);
}
if(ob6.choice==2)
{
System.out.println("CARD TYPE :DEBIT CARD");
System.out.println("BANK NAME :"+ob6.ma);
System.out.println("ACCOUNT NUMBER :"+ob6.ac);
System.out.println("PIN CODE :"+ob6.pin);
if(ob3.cla==1)
System.out.println("TOTAL COST :Rs."+ob.N*2500);
if(ob3.cla==2)
System.out.println("TOTAL COST :Rs."+ob.N*1500);
if(ob3.cla==3)
System.out.println("TOTAL COST :Rs."+ob.N*1000);
}
}
if(ob2.ch==2)
{
System.out.println(" ");
System.out.println("BANK NAME :"+ob2.na);
System.out.println("ACCOUNT NUMBER :"+ob2.acc);
if(ob3.cla==1)
System.out.println("TOTAL COST :Rs."+ob.N*2500);
if(ob3.cla==2)
System.out.println("TOTAL COST :Rs."+ob.N*1500);
if(ob3.cla==3)
System.out.println("TOTAL COST :Rs."+ob.N*1000);
}
System.out.println(" ");
System.out.println("=================================================================");
System.out.println("TODAY'S DATE IS :"+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
System.out.println("");
System.out.println("**********HAVE A HAPPY JOURNEY**********");
System.out.println("_________________________________________________________________");
System.out.println("For complaints please contact 9945691846 or 8095561648.");
System.out.println("__________________________________________________________________");
System.out.println("Do you want to continue(y/n)?");
String ch=in.next();
if(ch.equalsIgnoreCase("n"))
System.exit(0);
else
System.out.println(" ");
ob1.disp();
System.out.println("");
}
}
} 