import java.util.*;
class emp{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.print("Enter a employee number:");
int no=in.nextInt();
System.out.print("Enter a employee Name:");
Scanner out=new Scanner(System.in);
String name=out.nextLine();
System.out.print("enter a employee Basic pay : ");
int bp=in.nextInt();
int hra=(bp*10)/100;
int tax=(bp*50)/100;
int da=(bp*15)/100;
int loan=(bp*12)/100;
int lic=(bp*5)/100;
int ns=bp+hra+tax+da;
int ded=lic+loan;
int gs=ns-ded;   
System.out.println("Basic pay:"+bp);
System.out.println("Net salary :"+ns);
System.out.println("Deduction:"+ded);
System.out.println("gross salary:"+gs);
}
}