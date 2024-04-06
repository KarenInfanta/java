import java.util.*;
class big{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("Enter A : ");
int a=in.nextInt();
System.out.print("Enter B : ");
int b=in.nextInt();
System.out.print("Enter C : ");
int c=in.nextInt();

if(a>b && a>c)
{
System.out.print("the  biggest number is ="+a+"(A)");
}
else if(b>a && b>c)
{
System.out.print("the  biggest number is ="+b+"(B)");
}
else
{
System.out.print("the  biggest number is ="+c+"(C)");
}
}
}    