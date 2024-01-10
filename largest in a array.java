import java.util.Scanner;  
public class large
{  
    public static void main(String[] Strings)   
     {  
	int[] myNum = {4,9,7,1,0};
	int max=myNum[0];
	for(int i=1;i<myNum.length;i++)
	{
	    if(myNum[i]>max)
	      max=myNum[i];
	 }
       System.out.println("Maximum is"+max);
     }

}