import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N = input.nextInt();
	int sum=0;
	while(N>0)
	{
	   int digit=N%10;
	   sum=sum+digit;
	   N=N/10;
	}
	System.out.println("Sum of digits of is "+sum);
}
}