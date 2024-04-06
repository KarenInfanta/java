import java.util.*;
class three{
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int b=in.nextInt();
int c=in.nextInt();
void number()
{
if(a>b && a>c)
{
System.out.println("a is greater");

}
else if(b>a && b>c)
{
System.out.println("b is greater");

}
else
{
System.out.println("c is greater");

}
}
}
class greater{
public static void main(String[]args)
{
three N=new three();
N.number();
}
}