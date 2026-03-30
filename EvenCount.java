import java.util.Scanner;

public class EvenCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int count = 0;
        for (int nums : arr) {
            if (nums % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

}
