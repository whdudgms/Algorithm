import java.util.Scanner;

class Main{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = 1000 - sc.nextInt();
         
        int count = 0;
        while(true){
            if(n - 500 >= 0){
                n -= 500;
                count++;
                continue;
            }else if(n - 100 >= 0){
                n -= 100;
                count++;
                continue;
            }else if(n - 50 >= 0){
                n -= 50;
                count++;
                continue;
            }else if(n - 10 >= 0){
                n -= 10;
                count++;
                continue;
            }else if(n - 5 >= 0){
                n -= 5;
                count++;
                continue;
            } 
            else if(n - 1 >= 0){
                n -= 1;
                count++;
                continue;
            } 
            if (n == 0){
                break;
            }
        }
        System.out.println(count);
    }
}