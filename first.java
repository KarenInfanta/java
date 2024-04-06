import java.util.*;
class first{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("enter a number:");
int n=in.nextInt();
int temp=n;
int num=0;
while(n!=0)
{
 num=n%10;
n=n/10;

}
System.out.println("first:"+num);
System.out.println("last num:"+(temp%10));
}
}