import java.util.Scanner;

public class D3_13218 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case=sc.nextInt();
        for(int t=1; t<=test_case; t++){
            System.out.println("#"+t+" "+sc.nextInt()/3);
        }
    }
}
