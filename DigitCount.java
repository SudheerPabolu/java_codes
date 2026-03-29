import java.util.*;
public class DigitCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = 0;
        while(n > 0){
            n = n/10;
            length++;
        }
        sc.close();
        System.out.println(length);
    }
}
// n = n / 10 remove the units place
// n = n * 10 gives units place 
