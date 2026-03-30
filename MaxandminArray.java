import java.util.*;

public class MaxandminArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int[] arr = new int[arrlen];
        for (int i = 0; i < arrlen; i++) {
            arr[i] = sc.nextInt();
        }
        MinMax(arrlen, arr);
        sc.close();
    }

    public static void MinMax(int arrlen, int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrlen; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Minimum is: " + min);
        System.out.println("Maximum is: " + max);
    }
}
