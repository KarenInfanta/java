import java.util.*;
class natural{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("enter a number:");
int n=in.nextInt();
int i;
int sum=0;
for(i=1;i<=n;i++)
{
sum=sum+i;

}
System.out.print("sum of the series is:"+sum);
}
}