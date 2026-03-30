import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int[] arr = new int[arrlen];
        for (int i = 0; i < arrlen; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int pointer1 = 0;
        int pointer2 = arrlen - 1;
        while (pointer1 <= pointer2) {
            int temp = arr[pointer1];
            arr[pointer1] = arr[pointer2];
            arr[pointer2] = temp;
            pointer1++;
            pointer2--;
        }
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }
}
//using two-pointers to reverse an array