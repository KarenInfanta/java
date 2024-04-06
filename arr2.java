import java.util.*;
class arr2{
public static void main(String[]args)
{
int n,searchval;
Scanner in=new Scanner(System.in);
n=in.nextInt();
int x[]=new int[n];
searchval=in.nextInt();
System.out.println("enter a array number:");
for(int i=0;i<n;i++)
{
x[i]=in.nextInt();
if(x[i]==searchval)
    {
System.out.println("searched element is found :"+(i+1));
break;

}
else
{
System.out.println("searched element value is not found");
}
}
}
}