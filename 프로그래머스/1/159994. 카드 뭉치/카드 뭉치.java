class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < goal.length; i++){
            
            if(!cards2[b].equals(goal[i]) && !cards1[a].equals(goal[i])){
                System.out.println(goal[i]);
                System.out.println(cards2[b]);
                System.out.println(cards1[a]);
                return "No";
            }
            
            if(cards1[a].equals(goal[i])){
                if(cards1.length-1 > a){
                    a++;
                }
                System.out.println(a);
                continue;
            } 
            if(cards2[b].equals(goal[i])){
                if(cards2.length-1 > b){
                    b++;
                }
                System.out.println(a);
                continue;
            }
            
            
        }
        
        return answer;
    }
}