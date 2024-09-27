import java.util.Scanner;

class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
           int sum = 0;
        
        while(true){
            if(n % 5 == 0){
                System.out.println( sum + (n/5));
                return;
            }
            n -= 3;
            sum += 1;
            if(n == 0){
                System.out.println(sum);
                return;
            }
            if(n < 0){
              System.out.println(-1);            
              return;
            }
        }
 
    }
}