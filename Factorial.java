import java.util.*;
public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FactorialVal(n));
        sc.close();
    }
    public static int FactorialVal(int n){
        int factorialVal = 1;
        for(int i = 1;i <= n;i++){
            factorialVal *= i;
        }
        return factorialVal;
    }
}