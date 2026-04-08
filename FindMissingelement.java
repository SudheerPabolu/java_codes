import java.util.Scanner;

public class FindMissingelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int ap = n * (n + 1) / 2;
        System.out.println(ap - sum);
        sc.close();
    }
}
