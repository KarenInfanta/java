import java.util.*;
class naturaldow{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("enter a number:");
int n=in.nextInt();
int i=1;
int sum=0;
do
{
sum=sum+i;
i++;
}while(i<=n);

System.out.print("sum of the series is:"+sum);
}
}