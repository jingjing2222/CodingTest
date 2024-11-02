import java.util.Scanner;
public class L2_1288 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case=sc.nextInt();
        boolean is_num_ok=false;
        for(int t=1; t<=test_case; t++){
            int num1=sc.nextInt();
            int num2=num1;
            int k=1;
            int sum=0,total=0;
            int[] num= new int[10];
            for(int i=0; i<10; i++) num[i]=0;
            while(is_num_ok!=true){
                total=num2;
                while(num2!=0) {
                    num[num2 % 10] = 1;
                    num2 /= 10;
                    for (int i = 0; i < 10; i++) {
                        sum += num[i];
                    }
                    if (sum == 10) {
                        is_num_ok = true;
                        break;
                    }
                    sum=0;
                }
                num2=(++k*num1);
            }
            System.out.println("#"+t+" "+total);
            is_num_ok=false;
        }
    }
}
