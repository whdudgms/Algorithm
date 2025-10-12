class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int winCount = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }
            for (int win : win_nums) {
                if (lotto == win) {
                    winCount++;
                    break;
                }
            }
        }

        int minWinCount = winCount;
        int maxWinCount = winCount + zeroCount;

        int minRank = (minWinCount >= 2) ? 7 - minWinCount : 6;
        int maxRank = (maxWinCount >= 2) ? 7 - maxWinCount : 6;

        return new int[]{maxRank, minRank};
    }
}
