import java.util.*;
class day{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("Enter a no of days : ");
int days=in.nextInt();

switch(days%7)
{
case 1:
{
System.out.print("thursday");
break;
}
case 2:
{
System.out.print("friday");
break;
}
case 3:
{
System.out.print("saturday");
break;
}
case 4:
{
System.out.print("sunday");
break;
}
case 5:
{
System.out.print("monday");
break;
}
case 6:
{
System.out.print("tuesday");
break;
}
default:
{
System.out.print("give valid day");
}

}
}
}
