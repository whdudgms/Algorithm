import java.util.Queue;
import java.util.LinkedList;

class Solution {
    boolean solution(String s) {
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            q.offer(s.charAt(i));
        }

        int a = 0;
        int b = 0;

        while (!q.isEmpty()) {
            if ('(' == q.poll()) {
                a++;
            } else {
                b++;
            }

            if (a < b) return false;
        }

        return a == b;
    }
}