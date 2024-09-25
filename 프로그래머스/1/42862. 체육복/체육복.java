import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        // 배열 정렬 (여분과 잃어버린 학생의 순서가 중요하기 때문에)
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 중복 제거 (자기 자신이 잃어버리고 여분이 있는 경우)
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    reserve[i] = -1;  // 이미 여분을 사용한 학생 표시
                    lost[j] = -1;     // 체육복을 이미 확보한 학생 표시
                    answer++;         // 체육복을 가진 학생 수 증가
                    break;
                }
            }
        }

        // 여분이 있는 학생들이 인접한 학생들에게 체육복을 빌려준다.
        for (int i = 0; i < reserve.length; i++) {
            if (reserve[i] == -1) continue; // 이미 사용한 여분은 건너뜀
            for (int j = 0; j < lost.length; j++) {
                if (lost[j] == -1) continue; // 이미 체육복을 받은 학생은 건너뜀
                if (reserve[i] == lost[j] - 1 || reserve[i] == lost[j] + 1) {
                    answer++;  // 체육복을 빌려주면 수업을 들을 수 있는 학생 수 증가
                    lost[j] = -1;  // 체육복을 받은 학생으로 표시
                    break;
                }
            }
        }

        return answer;
    }
}
