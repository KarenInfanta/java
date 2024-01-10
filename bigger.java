import java.util.Scanner;
public class bigger{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter a number1");
int n1=input.nextInt();
System.out.println("Enter a number2");
int n2=input.nextInt();
System.out.println("Enter a number3");
int n3=input.nextInt();
if((n1>n2)&&(n1>n3)){
System.out.println(n1+" is greater");
}
else if((n2>n1)&&(n2>n3)){
System.out.println(n2+" is greater");
}
else if((n3>n2)&&(n3>n1)){
System.out.println(n3+" is greater");
}
}
}
