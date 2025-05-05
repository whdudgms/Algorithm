import java.io.*;
import java.util.*;

public class Main {
    static int N, S;
    static int[] arr;
    static boolean[] visited;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        visited = new boolean[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        S = Integer.parseInt(br.readLine());

        result = bfs(S);

        System.out.println(result);
    }

    static int bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        int count = 1;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            int left = current - arr[current];
            int right = current + arr[current];

            if (left > 0 && !visited[left]) {
                visited[left] = true;
                queue.add(left);
                count++;
            }

            if (right <= N && !visited[right]) {
                visited[right] = true;
                queue.add(right);
                count++;
            }
        }

        return count;
    }
}
