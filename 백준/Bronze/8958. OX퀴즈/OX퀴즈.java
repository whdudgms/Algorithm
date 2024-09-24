import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for(int i = 0; i  < a; i++){
            String str = sc.next();
            int result = 0;
            int flag = 1;
            
            for(int j = 0; j < str.length(); j++){
                if('O' == str.charAt(j)){
                    result += flag;
                    flag++;
                }else{
                    flag = 1;
                }
            }
            System.out.println(result);
        }
    }
}