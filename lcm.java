import java.util.*;
class lcm{
public static void main(String[]args){
Scanner in=new Scanner(System.in);
System.out.print("Enter N:");

int n=in.nextInt();
if(n>0)
{
int a,b,x,y;
int lcm,gcd;


System.out.print("Enter NUMBER1:");
 x=in.nextInt();

System.out.print("Enter NUMBER2:");
 y=in.nextInt();
a=x;
b=y;
while(b!=0)
{
int temp=b;
b=a%b;
a=temp;


}
gcd=a;
lcm=(x*y)/gcd;

System.out.println("LCM IS :"+lcm);
System.out.println("GCD IS :"+gcd);
}
else{
System.out.println("not eligible");
}
}
}