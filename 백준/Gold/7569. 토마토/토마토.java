import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class PointXYZ {
    int height;
    int row;
    int col;

    public PointXYZ(int height, int row, int col){
        this.height = height;
        this.row = row;
        this.col = col;
    }
}

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 토마토가 익을 수 있는 6가지 방향 (상하좌우 + 위층, 아래층)
    static int rowArr[] = {-1, 0, 1, 0, 0, 0};
    static int colArr[] = {0, 1, 0, -1, 0, 0};
    static int heightArr[] = {0, 0, 0, 0, 1, -1};

    static int m, n, h;
    static int arr[][][];
    static Queue<PointXYZ> queue = new LinkedList<>();


    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken()); // 열
        n = Integer.parseInt(st.nextToken()); // 행
        h = Integer.parseInt(st.nextToken()); // 높이(층)

        arr = new int[h + 1][n + 1][m + 1]; // 1부터 시작하는 배열

        // 배열 입력 및 처음부터 익어 있는 토마토를 큐에 넣기
        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= n; j++){
                st = new StringTokenizer(br.readLine());
                for(int k = 1; k <= m; k++){
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                    // 처음 익어 있는 토마토(값=1)는 BFS 시작점이므로 큐에 삽입
                    if(arr[i][j][k] == 1)
                        queue.add(new PointXYZ(i, j, k));
                }
            }
        }

        System.out.println(bfs());
    }


    /**
     * BFS 메서드 (토마토가 모두 익는 데 필요한 최소 날짜를 구함)
     *
     * - 큐에는 현재 익은 토마토의 위치들이 들어있음
     * - 큐에서 하나씩 꺼내서 6방향으로 전파
     * - 익지 않은 토마토(arr 값이 0이면) 익도록 만들고 (값+1)
     * - 새로 익은 토마토는 다시 큐에 넣어 다음 전파 단계에서 사용
     *
     * BFS가 끝나면 전체 배열을 돌며:
     * - 0(안 익은 토마토)이 남아 있으면 -1
     * - 그 외에는 배열에서 가장 큰 값 - 1이 걸린 날짜
     */
    private static int bfs() {
        while (!queue.isEmpty()) {
            PointXYZ point = queue.poll(); // 현재 익은 토마토

            int height = point.height;
            int row = point.row;
            int col = point.col;

            // 6방향으로 전파
            for(int i = 0; i < 6; i++){
                int moveHeight = height + heightArr[i];
                int moveRow = row + rowArr[i];
                int moveCol = col + colArr[i];

                // 익힐 수 있는 위치인지 검사
                if(checkPoint(moveHeight, moveRow, moveCol)){
                    queue.add(new PointXYZ(moveHeight, moveRow, moveCol));
                    arr[moveHeight][moveRow][moveCol] = arr[height][row][col] + 1;  
                }
            }
        }

        // BFS가 끝난 후: 전체 배열을 보며 결과 평가
        int result = Integer.MIN_VALUE;

        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= m; k++){
                    if(arr[i][j][k] == 0)
                        return -1; // 익지 못한 토마토 존재 → 실패
                    result = Math.max(result, arr[i][j][k]);
                }
            }
        }

        // 처음부터 모두 익어 있었으면 0일
        if(result == 1) return 0;

        return result - 1; // 시작이 1이었으므로 -1 해서 일수 계산
    }


    /**
     * checkPoint 메서드
     * → 해당 좌표가 익힐 수 있는 위치인지 검사
     *
     * 조건:
     * 1) 배열 범위를 벗어나면 false
     * 2) arr 값이 0(익지 않은 토마토)일 때만 true
     */
    private static boolean checkPoint(int height, int row, int col){
        if(height < 1 || height > h || row < 1 || row > n || col < 1 || col > m)
            return false;

        return arr[height][row][col] == 0;
    }
}
