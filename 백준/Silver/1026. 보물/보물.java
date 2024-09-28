import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];
        Integer[] b = new Integer[n];  // Integer 배열로 변경
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        Arrays.sort(b); // Integer 배열이므로 reverseOrder 사용 가능
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (a[i] * b[n-i-1]);
        }
        System.out.println(sum);
    }
}
