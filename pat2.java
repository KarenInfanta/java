import java.util.*;
class pat2{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
for(int i=1;i<n;i++)
{
for(int space=0;space<(n-i-1);space++)
{
System.out.print(" ");
}
int x=1;
for(int j=0;j<=n;j++)
{
System.out.print(x+" ");
x=x*(i-j)/j+1;
}

System.out.println();

}
}
}