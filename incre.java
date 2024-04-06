import java.util.*;
class incre{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);

int x=5;
int y=7;
int z=-2;
x++;
System.out.println(x);
y=(y--)-x;
System.out.println(y);
z=x+y-(--z);
System.out.println(z);
x+=5;
System.out.println(x);
y/=5;
System.out.println(y);
z%=10;
System.out.println(z);
x++;
System.out.println(x);
y--;
System.out.println(y);
++z;
z=x+y;
System.out.println(z);
x=y-z;
System.out.println(x);
y=x*z;
System.out.println(y);
System.out.println(x);
System.out.println(y);
System.out.println(z);
}
}