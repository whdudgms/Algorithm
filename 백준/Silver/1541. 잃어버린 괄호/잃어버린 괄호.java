import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String[] ad = str.split("-");
        
        int result = 0;
        
        for(int i = 0; i < ad.length; i++){
            int tem =0;
            String add[] = ad[i].split("\\+");
            for(int j = 0; j < add.length; j++){
                tem += new Integer(add[j]);
            }
            if(i ==0){
                result += tem;
            }else{
                result -=tem;
            }
        }
        System.out.println(result);
        
    }
}