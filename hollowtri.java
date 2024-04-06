import java.util.*;
class hollowtri{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("enter a number:");
int n=in.nextInt();
for(int i=0;i<=n;i++)
{
for(int j=0;j<n-i;j++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print(" * ");
}

System.out.println();
}
}
}