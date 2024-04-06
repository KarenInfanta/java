import java.util.*;
class sqaure{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("enter a number:");
int n=in.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==j)
{
System.out.print("+");
}
else if(j==((n-i+1)))
{
System.out.print("+");
}
else
{
System.out.print("*");
}
}
System.out.println();
}
}
}