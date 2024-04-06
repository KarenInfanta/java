import java.util.*;
class three{
Scanner in=new Scanner(System.in);

System.out.println("Enter a Register number: ");
int reg=in.nextInt();
Scanner out=new Scanner(System.in);

System.out.println("Enter a student name: ");
String name=out.nextLine();

System.out.println("Enter a  tamil mark: ");
int b=in.nextInt();

System.out.println("Enter a english mark: ");
int c=in.nextInt();

System.out.println("Enter a maths mark: ");
int d=in.nextInt();

System.out.println("Enter a science mark: ");
int e=in.nextInt();

System.out.println("Enter a social mark: ");
int f=in.nextInt();

void number()
{



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

class report{
public static void main(String[]args)
{
three N=new three();
N.number();
}
}





