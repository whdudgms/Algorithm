import java.util.Scanner;
class Main{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int sum =0;
        for(int i=0; i < 5; i++){
            a = sc.nextInt();
            sum += (a*a);
        }
        System.out.println(sum%10);
        
    }
}