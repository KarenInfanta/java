import java.util.*;
class simple{
int p,n,simp,a,pow1,com;
int choice;

void input()
{
Scanner in=new Scanner(System.in);
System.out.println("enter a principle amount:");
p=in.nextInt();
System.out.println("enter a net amount:");
n=in.nextInt();
System.out.println("enter age:");
choice=in.nextInt();

}
void output()
{
if(choice>18)
{
System.out.println("Senior citizen");
simp=((p*n*12/100)/100);
a=(1+12/100);
pow1=(a^n);
com=p*pow1;
System.out.println("simple interest:"+simp);
System.out.println("compound interest :"+com);
}
else
{
 simp=((p*n*10/100)/100);
 a=(1+10/100);
pow1=(a^n);
 com=p*pow1;
System.out.println("simple interest:"+simp);
System.out.println("compound interest :"+com);

}
}
}

class comp{
public static void main(String[]args)
{
simple S=new simple();
S.input();
S.output();
}
}