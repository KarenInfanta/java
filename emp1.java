import java.util.*;
class emp1{
public static void main(String[]args){
Scanner in=new Scanner(System.in);
System.out.print("ENTER A employee NUMBER:");
int no=in.nextInt();
Scanner out=new Scanner(System.in);
System.out.print("ENTER A employee NAME:");
String name=out.nextLine();
System.out.print("ENTER A SALARY AMOUNT:");
int cur=in.nextInt();
int tax;
if(cur<500000)
{ 
System.out.print("~~~~~~~~~~~ NO TAX TO BE PAY~~~~~~~~~~~");
}
else if(cur>=500000 && cur<1000000)
{
tax=cur*10/100;
System.out.println(tax);

System.out.println(" PAYING AMOUNT:"+(cur-tax));
}
else if(cur>=1000000 && cur<2000000)
{

tax=cur*(15/100);
System.out.println(" PAYING AMOUNT:"+(cur-tax));
}

else if(cur>=2000000 && cur<3000000)
{
tax=cur*(20/100);

System.out.println(" PAYING AMOUNT:"+(cur-tax));

}
else
{
tax=cur*(30/100);

System.out.println(" PAYING AMOUNT:"+(cur-tax));

}
}
}
