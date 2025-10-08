

import java.util.*;

class Solution {
    static class Data implements Comparable<Data> {
        int stage;
        double failPercent;
        
        public Data(int s, double fp) {
            stage = s;
            failPercent = fp;
        }
        
        @Override
        public int compareTo(Data o) {
            if (this.failPercent == o.failPercent) {
                return this.stage - o.stage;
            }
            else if (this.failPercent > o.failPercent)
                return -1;
            else return 1;
        }
    }
    
    public int[] solution(int N, int[] stages) {
        int[] people = new int[N+2];
        
        for (int stage: stages) {
            for (int i = 1; i <= stage; i++)
                people[i]++;
        }
        
        ArrayList<Data> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            double failPercent = 0;
            if (people[i] > 0)
                failPercent = (double)(people[i] - people[i+1]) / people[i];
            list.add(new Data(i, failPercent));
        }
        
        Collections.sort(list);
        
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            Data d = list.get(i);
            answer[i] = d.stage;
        }
        
        return answer;
    }
}
