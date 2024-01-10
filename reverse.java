import java.util.Scanner;
public class reverse{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter a number");
int n=input.nextInt();
int digit=0;
int temp=0;
while(n>0)
{
digit=n%10;
temp=temp*10+digit;
n=n/10;
}
System.out.println("The reverse is"+temp);
}
}
