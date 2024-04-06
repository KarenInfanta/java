import java.util.*;
class vote{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("Enter a age : ");
int age=in.nextInt();
if(age>=18)
{
System.out.print("Eligible to vote");

}
else
{
System.out.println("Not Eligible to vote \n");
System.out.println("need "+ (18-age)+" years to vote");

}
}
}
