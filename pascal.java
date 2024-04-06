import java.util.*;
class natural{
public static void main(String[]args)
{
int i=1;
Scanner in=new Scanner(System.in);
System.out.print("enter a number:");
int n=in.nextInt();
while( i<=n)
{
int sum=sum+i;
i++;
}
System.out.print("sum of the series is:"+sum);
}
}