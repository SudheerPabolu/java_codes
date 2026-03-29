import java.util.*;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        ArrayList<Integer> primefactors = factorsofnums(nums);
        for (int n : primefactors) {
            System.out.print(n + " ");
        }
        sc.close();
    }

    public static ArrayList<Integer> factorsofnums(int nums) {
        ArrayList<Integer> primefactors = new ArrayList<Integer>();
        for (int i = 2; i <= nums; i++) {
            while(nums % i == 0 && nums > 0) {
                primefactors.add(i);
                nums /= i;
            }
        }
        return primefactors;
    }
}
