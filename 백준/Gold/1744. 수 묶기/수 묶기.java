import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) throws IOException{
    
        // 총 숫자 수 
        int N;
        // 양수 
        List<Integer> pn = new ArrayList<>();
         // 0 + 음수 
        List<Integer> nn = new ArrayList<>();
        
        // 데이터 가져오기 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(br.readLine());
            if(n > 0)
                pn.add(n);
            else 
                nn.add(n);
        }
        
        

            
        Collections.sort(pn, Collections.reverseOrder());
        Collections.sort(nn);
        
        
        
        int sum = 0;
        int i = 0; 
        while(i < pn.size()){
            if(i + 1 < pn.size() && pn.get(i) != 1 && pn.get(i + 1) != 1)
                sum += pn.get(i++) * pn.get(i++);
            else 
                sum += pn.get(i++);
        }
        
        
        
        i = 0; 
        
        // 절대값이 크고 (작은수 부터) 차례로 곱함 
        // 다음 수가 있고 현재수와 다음수가 1이 아니면 (의미 없지만) 곱한다 아니면 그냥 더하기
        while(i < nn.size()){
            if(i + 1 < nn.size() && nn.get(i) != 1 && nn.get(i + 1) != 1)
                sum += nn.get(i++) * nn.get(i++);
            else 
                sum += nn.get(i++);
        }
        
        bw.write(sum  + "\n");
        bw.flush();
        
        
    }

}