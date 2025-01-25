import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer num = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(num.nextToken());
        int b = Integer.parseInt(num.nextToken());
        
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for(int i = 0; i < b; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            
            min1 = Math.min(min1, num1);
            min2 = Math.min(min2, num2);
        }
        
        int result = 0;
        
        int case1 = min2 * a;
        
        int case2 = ((a + 5) / 6) * min1;
        
        int case3 = (a/6)* min1 + (a % 6) * min2;
        
        
        result = Math.min(case1,  Math.min(case2, case3));
    
        bw.write(result+"\n");
        bw.flush();
        bw.close();
        
    }
}