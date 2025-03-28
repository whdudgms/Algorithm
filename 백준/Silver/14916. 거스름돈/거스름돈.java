import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int count = 0;
        while(n > 0){
            if(n % 5 == 0){
                count +=  n / 5;
                System.out.print(count);
                return;
            }else{
               n -= 2;
               count++;
            }
                       
        }
        if(n < 0) 
        {
        System.out.print(-1);
        return;
        }
        System.out.print(count);

    }
}