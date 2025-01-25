import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer num = new StringTokenizer(br.readLine());
        
         // 끊어진 줄 
        int a = Integer.parseInt(num.nextToken());
        // 기타줄 브랜드의 갯수     
        int b =  Integer.parseInt(num.nextToken());
        
        
        int min1 = -1;
        int min2 = -1;
        
        StringTokenizer st;
        for(int i = 0; i < b; i++){
            st = new StringTokenizer(br.readLine());
            int num1 =  Integer.parseInt(st.nextToken());
            int num2 =  Integer.parseInt(st.nextToken());
            
            min1 = min1 == -1 || min1 > num1 ?  num1 : min1;
            min2 = min2 == -1 || min2 > num2 ?  num2 : min2;
        }
        
        //9개 12개 이런식으로 끊어질 수 있는개  6개 마다로 계산해서 출력하나보다. 
        
        // 낱개 
        int result = 0;
        
        if(a % 6 > 0){
            result += min1 > (min2 * (a % 6)) ? (min2*(a % 6)) : min1;
            a -= a % 6;
        }
        
        
        // 몫
        if(a / 6 > 0)
           result += min1 * (a / 6 ) > (min2 * a) ? (min2 * (a)) : min1*( a / 6 );
            
        bw.write(result+ "\n");
        bw.close();
 
    }
} 