import java.util.*;


class Solution {
    public int[] solution(int[] answers) {
        
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        
        int an = 0;
        int bn = 0;
        int cn = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) an++;
            if (answers[i] == b[i % b.length]) bn++;
            if (answers[i] == c[i % c.length]) cn++;
        }
        int max = Math.max(an, Math.max(bn, cn));
        ArrayList<Integer> list = new ArrayList<>();
        
        if (an == max) list.add(1);
        if (bn == max) list.add(2);
        if (cn == max) list.add(3);
        
        // int[]로 변환
        return list.stream().mapToInt(i -> i).toArray();
    }
}