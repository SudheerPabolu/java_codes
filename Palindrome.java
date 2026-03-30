import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        str = str.toLowerCase();
        int p1 = 0;
        int p2 = str.length() - 1;
        boolean value = true;
        while (p1 < p2) {
            if (str.charAt(p1) != str.charAt(p2)) {
                value = false;
                break;
            } else {
                p1++;
                p2--;
            }
        }
        System.out.println(value);
    }
}
