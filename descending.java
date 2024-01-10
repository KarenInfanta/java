import java.util.Scanner;

public class descending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size of the array");
        int N = input.nextInt();
        int[] mynum = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Enter element");
            mynum[i] = input.nextInt();
        }

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            int max = mynum[0];
            int maxIndex = 0;
            for (int j = 1; j < mynum.length; j++) {
                if (mynum[j] > max) {
                    max = mynum[j];
                    maxIndex = j;
                }
            }
            array[i] = max;
            mynum[maxIndex] = Integer.MIN_VALUE;
        }

        System.out.println("Sorted Array in Descending Order:");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
