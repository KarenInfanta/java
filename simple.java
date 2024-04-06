import java.util.*;
class   simple{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("enter a principle amount:");

int p=in.nextInt();
System.out.print("enter a net  amount:");
int n=in.nextInt();
System.out.print("enter a R amount:");
int r=in.nextInt();
int simple=(p*n*r)/100;
int com=p*(1+r/100);
System.out.println("Simple Interest: "+simple);
System.out.println("compound Interest: "+Math.pow(com,n));


}
} 