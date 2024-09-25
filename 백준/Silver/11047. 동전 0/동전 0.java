import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] won = new int[n];
        int result = 0;
        
        
        for(int i = 0; i < n; i++){
            won[i] = sc.nextInt();
        }
        
        while(k != 0){
            for(int i = n-1; i >= 0; i--){
                if(k >= won[i]){
                   k -= won[i];
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}