import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String[] agrs){
        
        Scanner sc =  new Scanner(System.in);
        int n =  sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++){
            ar.add(sc.nextInt());
        }
        
        ar.sort((a,b)-> a-b);
        
        int sum = 0;
        int time = 0;
        
        for(int i = 0; i < n; i++){
            sum += ar.get(i);
            time  += sum;
        }
        System.out.println(time);
    }
}