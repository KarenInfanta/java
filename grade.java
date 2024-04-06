import java.util.*;
class grade{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("Enter a Total mark: ");
int a=in.nextInt();

if(a>90)
{
System.out.print("grade  is (s)");
}
else if(a<90 && a>80)
{
System.out.print("grade  is (A)");
}
else if(a<80 && a>70)
{
System.out.print("grade  is (b)");
}
else if(a<70 && a>60)
{
System.out.print("grade  is (c)");
}
else if(a<60 && a>50)
{
System.out.print("grade  is (D)");
}

else
{
System.out.print("sorry!! your are failed");
}
}
}    