package Railway;
import java.util.*;
import java.io.*;
class railrev
{int number;
int x=railway.N;

int b[][]=new int[10][10];
public railrev()
{System.out.println("*********************THE SEATS IN THIS COACH*********************");
System.out.println("*********************~~~~~~~~~~~~~~~~~~~~~~~*********************");
System.out.println("(The number of rows and column should be greater than the number of seats in the left diagonal.)");


System.out.println("");

for(int r=0;r<10;r++)
{
for(int c=0;c<10;c++)
{
b[r][c]=0;
}
}
}
public void disp()
{



for(int r=0;r<10;r++)
{
for(int c=0;c<10;c++)
{
System.out.print(" "+b[r][c]+" ");
}
System.out.println();
}}
//enter row and column no. of seat 
//you want to reserve.
public void check(int r,int c)
{for(int in=0;in<=x;in++)
{boolean flag=false;
r=r-1;
c=c-1;

if(r<0||r>=10||c<0||c>=10)
{
System.out.println("Sorry,there are only 10 rows and 5 columns");
}
else if(b[r][c]==0)
{
b[r][c]=1;
System.out.println("Requested Confirmed.");
disp();
}
else if(b[r][c]==1)
{
for(int j=0;j<10;j++)
{
if(b[r][c]==1)
{
System.out.println("You have been given an alternative seat.Your seat number is at row= "+(r+1)+" and column= "+(j+1));
flag=true;
break;
}
}
if(flag==false) 
System.out.println("Sorry no seat is vacant in this row please select another row");
System.out.println("");
disp();
}}
}}
