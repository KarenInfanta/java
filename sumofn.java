import java.util.Scanner;
public class sumofn{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter a number");
int n=input.nextInt();
int s=0;
for(int i=1;i<=n;i++)
{
s=s+i;
}
System.out.println("Sum of numbers:"+s);
}
}
