import java.util.*;
class one{
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int b=in.nextInt();
void number()
{
System.out.println(a);
}
void number1()
{
System.out.println(b);
System.out.println("addition:"+(a+b));
System.out.println("sub:"+(a-b));
System.out.println("mul:"+(a*b));
System.out.println("division:"+(a/b));
System.out.println("modulus:"+(a%b));
}
}
class two{
public static void main(String[]args)
{
one N=new one();
N.number();
N.number1();
}
}