import java.util.Scanner;
public class smallest{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
	System.out.println("Enter a size of the array");
	int N=input.nextInt();
	int[] mynum = new int[N];
	for(int i=0;i<N;i++)
	{
		System.out.println("Enter element");
		mynum[i]=input.nextInt();
	}	
	int max=mynum[0];
	for(int i=1;i<mynum.length;i++)
	{
	    if(mynum[i]<max)
	      max=mynum[i];
	 }
       System.out.println("maximum is"+max);
     }

}