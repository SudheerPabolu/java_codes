import java.util.*;

public class FibanocciSeries {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int result = 0;
        while(n > 0){
            result = first + second;
            first = second;
            second = result;
            n--;
        }
        System.out.println(first);
        sc.close();
    }
}