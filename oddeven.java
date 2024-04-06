import java.util.*;
class oddeven{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("enter a number:");
int n=in.nextInt();
int i;
int sum=0;
for(i=1;i<=n;i+=2)
{
sum=sum+i;

}
int sum1=0;
for(i=0;i<=n;i+=2)
{
sum1=sum1+i;

}
System.out.println("sum of the series of odd numbers:"+sum);
System.out.println("sum of the series of even numbers:"+sum1);


}
}