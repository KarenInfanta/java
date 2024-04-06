import java.util.*;
class bill{
public static void main(String[]args){
Scanner in=new Scanner(System.in);
System.out.print("ENTER A CUSTOMER NUMBER:");
int no=in.nextInt();
Scanner out=new Scanner(System.in);
System.out.print("ENTER A CUSTOMER NAME:");
String name=out.nextLine();
System.out.print("ENTER A TYPE:");
int type=in.nextInt();
System.out.print("ENTER A CURRENT MONTH READING:");
int cur=in.nextInt();
System.out.print("ENTER A PAST MONTH READING:");
int pass=in.nextInt();
int bill=cur-pass;
switch(type)
{
case 1:
{
System.out.println(" TYPE:DOMESTIC");
if(bill<100)
{
System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~NO PAYING AMOUNT!THANK YOU~~~~~~~~~~~~~~~~~~~~~~~~~~~");

}
else if(bill>=100 && bill<200)
{
System.out.print(" PAYING AMOUNT:"+(bill*1.40));
}
else if(bill>=200 && bill<300)
{
System.out.print(" PAYING AMOUNT:"+(bill*2.60));
}
else if(bill>=300 && bill<400)
{
System.out.print(" PAYING AMOUNT:"+(bill*4.00));
}
else
{
System.out.print(" PAYING AMOUNT:"+(bill*7.00));
}
break;
}
case 2:
{
System.out.println(" TYPE:INDUSTRY");
if(bill<100)
{
System.out.print(" PAYING AMOUNT:"+(bill*2.0));

}
else if(bill>=100 && bill<200)
{
System.out.print(" PAYING AMOUNT:"+(bill*2.70));
}
else if(bill>=200 && bill<300)
{
System.out.print(" PAYING AMOUNT:"+(bill*3.75));
}
else if(bill>=300 && bill<400)
{
System.out.print(" PAYING AMOUNT:"+(bill*7.0));
}
else
{
System.out.print(" PAYING AMOUNT:"+(bill*11.00));
}
break;
}
default:
{
System.out.print("INVALID TYPE ENTERED");
}
}
}
}