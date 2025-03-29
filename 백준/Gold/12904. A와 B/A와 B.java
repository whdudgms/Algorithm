import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;


class Main{
    public static void main(String[] agrs)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder(br.readLine());
        StringBuilder t = new StringBuilder(br.readLine());
        
        
       while(s.length() < t.length()){
           if(t.charAt(t.length() - 1) == 'A'){
                t.deleteCharAt(t.length() - 1);
           }else if (t.charAt(t.length() - 1) == 'B'){
                t.deleteCharAt(t.length() - 1);
                t.reverse();
           }
       }
        
     System.out.println(t.toString().equals(s.toString()) ? 1 : 0);

        
        
    }
}