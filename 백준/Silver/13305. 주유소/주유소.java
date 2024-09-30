import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        
        long[] len  = new long[a-1];
        long[] ju  = new long[a];
        
        //거리
        for(int i = 0; i <  len.length; i++){
            len[i] = sc.nextInt();
        }
        
        //주유소 
        for(int i = 0; i <  ju.length; i++){
            ju[i] = sc.nextInt();
        }
        
        long result = 0;
        long min = ju[0];
        
        for(int i = 0; i <  ju.length-1; i++){
            if(min > ju[i]){
                min = ju[i];
            }
            result +=  (len[i] * min);
        }
       System.out.println(result);
    }
}