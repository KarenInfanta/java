import java.util.*;
class condition{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("enter a A value:");

int a=in.nextInt();
System.out.print("enter a B value:");
int b=in.nextInt();
int con=(a<b)?a:b;
System.out.println("conditional:"+con);

}
}