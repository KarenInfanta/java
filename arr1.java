import java.util.*;
class arr1{
public static void main(String[]args)
{
int n,sum=0,sum1=0;
Scanner in=new Scanner(System.in);
n=in.nextInt();
int x[]=new int[n];
System.out.print("enter a array number:");
for(int i=0;i<n;i++)
{
x[i]=in.nextInt();
if(x[i]%2==0)
{
sum=sum+x[i];
}
else
{
 sum1=sum1+x[i];
}
}
System.out.println("even"+sum);
System.out.println("odd"+sum1);
}
}