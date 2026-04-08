
import java.util.HashMap;
import java.util.Scanner;

public class Countfreqofelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        eachfreq(arr, n);
        sc.close();
    }

    static void eachfreq(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int nums : arr) {
            if (map.containsKey(nums)) {
                map.put(nums, map.get(nums) + 1);
            } else {
                map.put(nums, 1);
            }
        }
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
