import java.util.Scanner;
public class vowels {
    public static void main(String []args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=obj.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u')){
                System.out.print(s.charAt(i));
                count++;
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print("\nno.of vowels::"+count);
    }
}
