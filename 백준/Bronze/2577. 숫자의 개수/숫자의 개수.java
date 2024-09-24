import java.util.Scanner;

class Main{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextInt() * sc.nextInt() * sc.nextInt() + "";
        int[] num = new int[10];
        
        //for문으로 a요소 가져온다.
        for(int i =0; i < a.length();i++){
            //a요소에 해당하는 num 배열 인덱스로 값 증가
            num[a.charAt(i)-'0']++;
        }
                //num배열 돌면서 값 출력.
        for(int i =0; i < num.length; i++){
            System.out.println(num[i]);
        } 
        
    }
}