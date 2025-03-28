
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){

            // 4개  // 2개
            // 조합 안 되면 -1출력 끝 .

            if(str.charAt(i) == 'X'){
                if(i + 3 < str.length() && str.charAt(i) == 'X'
                        &&   str.charAt(i + 1) == 'X'
                        &&   str.charAt(i + 2) == 'X'
                        &&   str.charAt(i + 3) == 'X' ){

                    sb.append("AAAA");

                    i += 3;

                    continue;
                }

                if(i + 1 < str.length() && str.charAt(i) == 'X' &&  str.charAt(i + 1) == 'X' ){

                    sb.append("BB");

                    i += 1;
                    continue;
                }
                System.out.println(-1);
                return;
            }

            if(str.charAt(i) == '.'){
                sb.append('.');
            }


        }


        System.out.print(sb.toString());


    }
}

