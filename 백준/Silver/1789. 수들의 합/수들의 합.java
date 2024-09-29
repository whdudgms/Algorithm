import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        
        long i = 1;
        long j = 0;
        while(a > 0){
            a -= i;
            i++;
            j++;
        }
        if(a < 0){
           System.out.println(j-1);
            return;
        }
        System.out.println(j);
      
    }
}