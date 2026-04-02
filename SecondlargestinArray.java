import java.util.Scanner;

public class SecondlargestinArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(SecondLarge(arr, n));
    }

    public static int SecondLarge(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            }else if(arr[i] < max && arr[i] > secondmax){
                secondmax = arr[i];
            }
        }
        return secondmax;
        
    }
}