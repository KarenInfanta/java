import java.util.*;
class hollowsquare{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("enter a number:");
int n=in.nextInt();
for(int i=0;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==0|| j==0||j==n-1||i==n-1)
{
System.out.print("*");
}
System.out.print(" ");
}
System.out.println();
}
}
}