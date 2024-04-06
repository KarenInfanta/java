import java.util.*;
class reverse{
public static void main(String[]args){
Scanner in=new Scanner(System.in);
int rev=0,rem=0;

System.out.print("Enter a number to be reverse:");
int num=in.nextInt();
int temp=num;
for(int i=1;i<=num;i++)
{
while(num>0)
{
rem=num%10;
 rev=rem+(rev*10);
num=num/10;

}
System.out.print("REVERSED NUMBER IS :"+rev);
}
}
}