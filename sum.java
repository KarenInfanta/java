import java.util.*;
class sum{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("enter a number:");
int n=in.nextInt();
int num=0, sum=0;
do
{
 num=n%10;
sum=sum+num;
n=n/10;


}while(num!=0);
System.out.println("sum:"+sum);
}
}