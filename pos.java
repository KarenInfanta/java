import java.util.*;
class pos{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("Enter a number : ");
int pos=in.nextInt();
if(pos>0)
{
System.out.print("the number "+pos+" is a postive number");

}
else if(pos==0)
{
System.out.println("the number "+pos+" is a neither postive nor negative   number");
}
else
{
System.out.print("the number "+pos+" is a negative number");
}
}
}    