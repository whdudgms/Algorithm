import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄: N, L
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        // 두 번째 줄: N개의 수
        int[] num = new int[N];
        st = new StringTokenizer(br.readLine()); // 여기서 새로 만들어야 함
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬
        Arrays.sort(num);

        int count = 0;      // 필요한 테이프 수
        int i = 0;          // 현재 위치 인덱스

        while (i < N) {
            int start = num[i];         // 테이프 시작 위치
            int end = start + L - 1;    // 테이프 끝 위치
            count++;                    // 테이프 하나 사용

            // 현재 테이프로 커버 가능한 구멍들을 넘긴다
            while (i < N && num[i] <= end) {
                i++;
            }
        }

        System.out.println(count);
    }
}
