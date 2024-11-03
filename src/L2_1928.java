import java.util.Scanner;
import java.util.Base64;

public class L2_1928 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case=sc.nextInt();
        sc.nextLine();
        for(int t=1; t<=test_case; t++){
            String s= sc.nextLine();
            byte[] by=Base64.getDecoder().decode(s);
            System.out.println("#"+t+" "+new String(by));
        }
    }
}
