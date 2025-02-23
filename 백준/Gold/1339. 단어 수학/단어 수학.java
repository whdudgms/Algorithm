import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기 추가

        int[] alphaArr = new int[26]; // 알파벳별 가중치 저장 배열
        
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine(); // 단어 입력
            
            for (int j = 0; j < s.length(); j++) {
                alphaArr[s.charAt(j) - 'A'] += (int) Math.pow(10, s.length() - 1 - j); // (int) 캐스팅 추가
            }
        }

        
        Arrays.sort(alphaArr);
        int nn = 9;
        int sum = 0;
        for(int i = 25; i > 16; i--){
           sum += alphaArr[i] * nn;
           nn--;
            if(nn == 0){
                break;
            }
        }
        System.out.println(sum);
        

    }
}
