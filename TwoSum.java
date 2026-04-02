import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of array:");
        int n = sc.nextInt();
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        System.out.println("Enter elements of Array of size " + n + " :");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = resultant(n, arr, target);
        if (result.length == 0) {
            System.out.println("No pair found");
        }
        for (int nums : result) {
            System.out.println(nums);
        }
        sc.close();
    }

    public static int[] resultant(int n, int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }
        return new int[] {};
    }
}
