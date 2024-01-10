import java.util.Scanner;
public class leap{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the year");
int n=input.nextInt();
if(((n%4==0)&&(n%100!=0))||n%400==0){
System.out.println("This year is a leap year");
}
else{
System.out.println("This year is not a leap year");
}
}
}
