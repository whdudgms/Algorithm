import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            sum += tmp > 0 ? tmp :  -tmp;
        }
        System.out.println( sum * 2);
        
    }
}