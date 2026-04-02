import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements of array & include some zeroes");
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        AlignZeroes(arr,n);
        for(int nums:arr){
            System.out.print(nums+ " ");
        }
    }
    public static void AlignZeroes(int[] arr,int n){
        int left = 0;
        for(int right = 0;right < arr.length;right++){
            if(arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right]  = temp;
                left++;
            }
        }
    }
}
