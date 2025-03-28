import java.io.*;
import java.util.*;

public class Main{
    
    static int[] alphabet = new int[26];	//알파벳 개수 저장 배열
    static StringBuilder sb = new StringBuilder();	//결과 저장할 StringBuilder
    static StringBuilder front = new StringBuilder();
    static StringBuilder end = new StringBuilder();
    public static void main(String[] agrs) throws IOException{
        
        //입력값 처리하는 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //결과값 출력하는 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String name = br.readLine();
        boolean check = false;
        int oddCheck = 0;
        char mid = '0';
        
        for(int i = 0; i < name.length(); i++){
            alphabet[name.charAt(i) - 65]++;
        }
        
        //팰린드롬 만들기
        for(int  i = 0; i  < alphabet.length; i++){
            if(alphabet[i] != 0 && alphabet[i] % 2 ==1){
                if(oddCheck == 0){
                    oddCheck++;
                    mid = (char) ('A' + i);
                }else{
                    sb = new StringBuilder("I'm Sorry Hansoo");
                    check = true;
                    break;
                }
            }
            
            for(int j = 0; j < alphabet[i]/2; j++){
                front.append((char)('A'+i));
                end.insert(0, (char)('A' +i));
            }
        }
        
        if(!check){
            if(mid == '0')
                sb.append(front).append(end);
            else
                sb.append(front).append(mid).append(end);
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
        
    }
}
