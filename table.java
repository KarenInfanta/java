import java.util.Scanner;
public class table{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter a number");
int a=input.nextInt();
int i;
for(i=1;i<=10;i++)
{
System.out.println(a+"X"+i+"="+a*i);
}
}
}