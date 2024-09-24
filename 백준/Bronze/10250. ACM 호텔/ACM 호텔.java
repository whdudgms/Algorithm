import java.util.Scanner;

class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            int h = sc.nextInt();  // 호텔의 층 수
            int w = sc.nextInt();  // 각 층의 방 수 (사용하지 않음)
            int n = sc.nextInt();  // n번째 손님
            
            // 층수 계산
            int x = n % h == 0 ? h : n % h;
            
            // 방 번호 계산
            int y = (n - 1) / h + 1;
            
            // 방 번호 출력
            System.out.println(x * 100 + y);
        }
    }
}
