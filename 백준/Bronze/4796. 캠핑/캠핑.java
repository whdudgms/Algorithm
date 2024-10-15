import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int k = 1;
        while(true){
            
            int a,b,c;
            a = sc.nextInt(); // 일동안만 사용
            b = sc.nextInt(); // 일중에서 
            c = sc.nextInt(); // 일짜리 휴가 
            
            if(a == 0 && b == 0 && c== 0){
                return;
            }
          
            int m = c / b; 
            int n = c % b;
            
            int sum = m*a + (n > a ? a : n); 
            
           System.out.println("Case "+k+": "+ sum);
            
           k++;                       
        }
        
    }
}