class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 첫 글자이거나, 이전 문자가 공백이면
            if (i == 0 || s.charAt(i - 1) == ' ') {
                if ('a' <= ch && ch <= 'z') {
                    answer.append((char)(ch - 32)); // 소문자 → 대문자
                } else {
                    answer.append(ch);
                }
            } 
            // 그 외
            else {
                if ('A' <= ch && ch <= 'Z') {
                    answer.append((char)(ch + 32)); // 대문자 → 소문자
                } else {
                    answer.append(ch);
                }
            }
        }

        return answer.toString();
    }
}
