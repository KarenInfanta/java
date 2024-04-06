import java.util.*;
class dayfour{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a string a:");
String a=in.nextLine();
System.out.println("Enter a string b:");
String b=in.nextLine();
int result=a.compareToIgnoreCase(b);
if(result==0 )
{
System.out.println("~~~~~~~~~~~~~~~~~~output~~~~~~~~~~~~~~~~~~~~~");
System.out.println(" both are same");
}
else
{
System.out.println("~~~~~~~~~~~~~~~~~~output~~~~~~~~~~~~~~~~~~~~~");
System.out.println("both are diff");

}
System.out.println("~~~~~~~~~~~~~~~~~~output~~~~~~~~~~~~~~~~~~~~~");
boolean sec=b.endsWith(a);
System.out.println("string ends with another string "+sec);
System.out.println("~~~~~~~~~~~~~~~~~~output~~~~~~~~~~~~~~~~~~~~~");
Calendar c = Calendar.getInstance();
System.out.println("Current Date and Time :"); 
System.out.format("%tB %te, %tY%n", c, c, c);
System.out.format("%tl:%tM %tp%n", c, c, c); 
System.out.println("~~~~~~~~~~~~~~~~~~output~~~~~~~~~~~~~~~~~~~~~");
String str=" The quick brown fox jumpS over the Lazy DOggg";
String newstr=str.replaceAll("fox","cat");
System.out.println("replaced string is :"+newstr);
System.out.println("~~~~~~~~~~~~~~~~~~output~~~~~~~~~~~~~~~~~~~~~");
String new1=str.substring(5,20);
System.out.println("sub string is :"+new1);
System.out.println("~~~~~~~~~~~~~~~~~~output~~~~~~~~~~~~~~~~~~~~~");
String new2=str.trim();
System.out.println("trimmed string is :"+new2);
System.out.println("~~~~~~~~~~~~~~~~~~output~~~~~~~~~~~~~~~~~~~~~");
String new3=str.toLowerCase();
System.out.println("lowercase string is :"+new3);
System.out.println("~~~~~~~~~~~~~~~~~~output~~~~~~~~~~~~~~~~~~~~~");
int len=str.length();
System.out.println("lenth of the string is :"+len);
boolean resul=a.equals(b);
if(resul==true)
{
System.out.println("~~~~~~~~~~~~~~~~~~output~~~~~~~~~~~~~~~~~~~~~");
System.out.println("both are equal");
}
else
{
System.out.println("~~~~~~~~~~~~~~~~~~output~~~~~~~~~~~~~~~~~~~~~");
System.out.println("diff");

}



}
}
