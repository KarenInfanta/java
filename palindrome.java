import java.util.*;
class palindrome{
public static void main(String[]args)
{
int a=0;
Scanner in=new Scanner(System.in);
System.out.print("ENTER A STRING:");
String name=in.nextLine();
int len=name.length();
for( int i=0;i<len;i++)
{
if(name.charAt(i)!=name.charAt((len-1)-i))
{
a++;`
break;
}

}
if(a==0)
{
System.out.print(" STRING is palindrome");
}
else
{
System.out.print(" STRING is not  palindrome");
}
}
}