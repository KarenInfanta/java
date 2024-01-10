import java.util.Scanner;
public class swap{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter a number1");
int a=input.nextInt();
System.out.println("Enter a number2");
int b=input.nextInt();
System.out.println("Numbers before swapping: n1="+a+" and n2="+b);
int temp=0;
temp=a;
a=b;
b=temp;
System.out.println("Numbers after swapping: n1="+a+" and n2="+b);
}
}
