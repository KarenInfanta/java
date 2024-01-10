import java.util.Scanner;
public class nth{
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int[] mynum = new int[10];
	int[] array = new int[10];
	for(int i=0;i<10;i++)
	{
		System.out.println("Enter element");
		mynum[i]=input.nextInt();
	}	
	System.out.println("Enter the m value(Maximum):");
	int m=input.nextInt();
	System.out.println("Enter the n value(Maximum):");
	int n=input.nextInt();
int max=mynum[0];
for (int i = 0; i < mynum.length; i++) {
            int max = mynum[0];
            for (int j = 1; j < mynum.length; j++) {
                if (mynum[j] > max) {
                    max = mynum[j];
                }
            }
            array[i] = max;
      }
System.out.println("Mth max number is"+a[M-1]);
//System.out.println("Nth min number is"+a[]);
     }

}