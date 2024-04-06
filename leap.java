import java.util.*;
class leap{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("Enter a year : ");
int leap=in.nextInt();
if(leap%4==0)
{
System.out.print("the year "+leap+" is a leap year");

}
else
{
System.out.println("the year "+leap+" is not a  leap year");
int b=4-(leap%4)+leap;
System.out.println("next leap year"+b);
System.out.println(" year left "+(4-(leap%4)));


}
}
}
