import java.util.Scanner;

public class D3_15941 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case=sc.nextInt();

        for(int t=1; t<=test_case; t++){
            int num=sc.nextInt();
            System.out.printf("#%d %d\n",t,num*num);
        }
    }
}