import java.util.*;
class arith{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("enter a A value:");

int a=in.nextInt();
System.out.print("enter a B value:");
int b=in.nextInt();

System.out.println("addition:"+(a+b));
System.out.println("sub:"+(a-b));
System.out.println("product:"+(a*b));
System.out.println("division:"+(a/b));
System.out.println("modulus:"+(a%b));
}
}