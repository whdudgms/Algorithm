import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(! (n % 10 == 0)){
            System.out.println(-1);
            return;
        }
        
        // 300 60 10 
        
        int a = 0;
        int b = 0;
        int c = 0;
        
        while(!(n == 0)){
            if(n - 300 >= 0){
                n -= 300;
                a++;
                continue;
            }
            if(n - 60 >= 0){
                n -= 60;
                b++;
                continue;
            }
            if(n - 10 >= 0){
                n -= 10;
                c++;
                continue;
            }
        } 
        
        System.out.println(a+" "+b+" "+c);
        
    }
}