import java.util.*;
class mark{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);

System.out.print("Enter a Register number: ");
int reg=in.nextInt();
Scanner out=new Scanner(System.in);

System.out.print("Enter a student name: ");
String name=out.nextLine();
System.out.print("Enter a  tamil mark: ");
int b=in.nextInt();

System.out.print("Enter a english mark: ");
int c=in.nextInt();

System.out.print("Enter a maths mark: ");
int d=in.nextInt();

System.out.print("Enter a science mark: ");
int e=in.nextInt();

System.out.print("Enter a social mark: ");
int f=in.nextInt();
if(b>=35 && c>=35 && d>=35 && e>=35 && f>=35)
{
int total=b+c+d+e+f;
int avg=total/5;

if(avg>90)
{
System.out.println("grade  is (s)");
}
else if(avg<90 && avg>80)
{
System.out.println("grade  is (A)");
}
else if(avg<80 && avg>70)
{
System.out.println("grade  is (b)");
}
else if(avg<70 && avg>60)
{
System.out.println("grade  is (c)");
}
else
{
System.out.println("grade  is (D)");

}
System.out.println("total is :"+total);
System.out.println("average is :"+avg);
}
else
{
System.out.print("sorry!! your are failed .not eligible");
}
}
}    