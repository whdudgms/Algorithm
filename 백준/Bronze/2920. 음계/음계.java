import java.util.Scanner;

class Main{

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        String result = "mixed"; //descending, mixed
    
        String num ="";
    
        for(int i = 0; i < 8; i++){
            num += sc.nextInt();
        }
        if("12345678".equals(num)){
           result = "ascending"; 
        }else if("87654321".equals(num)){
            result = "descending"; 
        }
        System.out.println(result);
    }
}