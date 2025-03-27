import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        // 데이터를 가져온다
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        String s = sc.next();
        
        // 받을 문자열 
        String str = "";
        
        //문자에 따라서 컵홀더를 추가한 문자열 만들기 
        for(int i = 0; i < a; i++){
            if(s.charAt(i) == 'S'){
                str += "*S";
            }else{
                str += "*LL";
                i++;
            }
        }
        str += "*";
   
        // 카운트 하고 더 작은 수 넣기 
        int count = 0;
        for(int i = 0; i  < str.length(); i++){
            if(str.charAt(i) == '*') count++;
        }
        count = Math.min(count, a);
        System.out.print(count);
        
    }
}