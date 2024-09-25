import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        
        int[][] time = new int[n][2];
        
        for(int i = 0; i < n; i++){
            time[i][0] = in.nextInt();
            time[i][1] = in.nextInt();
        }
        
        
        Arrays.sort(time, new Comparator<int[]>(){
            
            @Override
            public int compare(int[] o1, int[] o2){
                
                //종료시간이 같을 경우 시작 시간이 더 빠른 순으로 정렬해야 한다.
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                
                return o1[1] - o2[1];
            }
        });
        
        int count = 0;
        int prev_end_time = 0;
        
        for(int i = 0; i < n; i++){
            
            //직전 종료시간이 다음 회의 시간보다 작거나 같다면 갱신 
            if(prev_end_time<= time[i][0]){
                prev_end_time = time[i][1];
                count++;
            }
        }
        System.out.println(count);
        
    }
}