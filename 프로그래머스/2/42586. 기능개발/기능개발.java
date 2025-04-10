import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        
        int count = 0;
        int index = 0;
        int len = progresses.length;

        while (index < len) {
            count++;

            int num = 0;
            // 현재 count일 기준으로 배포 가능한 기능 수 계산
            while (index < len && progresses[index] + count * speeds[index] >= 100) {
                num++;
                index++;
            }

            if (num > 0) {
                queue.offer(num);
            }
        }

        int[] answer = new int[queue.size()];
        int i = 0;
        while (!queue.isEmpty()) {
            answer[i++] = queue.poll();
        }

        return answer;
    }
}
