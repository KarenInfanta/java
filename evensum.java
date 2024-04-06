import java.util.*;
class evensum{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("enter a number:");
int n=in.nextInt();
int i;
int sum=0;
for(i=2;i<=n;i+=2)
{
sum=sum+i;

}
System.out.print("sum of the odd  series is:"+sum);
}
}