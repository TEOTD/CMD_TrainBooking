package Railway;
import java.util.*;
import java.io.*;
public class age
{
    int age1;
    public void ag()
    {
        Scanner in=new Scanner(System.in);
        railway ob5=new railway();
        for(int v=0;v<ob5.N;v++)
        {
        System.out.print("Enter age :"+(v+1)+")");
        age1=in.nextInt();
        }
        if(age1>100&&age1<=3)
        {
           System.out.print("ENTER AGE BELOW 100 AND ABOVE 3 YEARS");
           ag();
        }
}
}    