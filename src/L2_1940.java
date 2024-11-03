/*
0입력 = 현재 속도 덧셈
1입력 -> 가속도 입력 -> 현재 속도 가속 더하고 거리 덧셈
2입력 -> 감속도 입력 -> 현재 속도에서 감속 빼고 거리 덧셈
*/
import java.util.Scanner;
public class L2_1940 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for(int t=1; t<=test_case; t++){
            int v=0;
            int result=0;
            int num=sc.nextInt();
            for(int i=0; i<num; i++){
                int num1=sc.nextInt();
                if(num1==0){
                    result+=v;
                }
                else if(num1==1){
                    v+=sc.nextInt();
                    result+=v;
                }
                else{
                    int acc=sc.nextInt();
                    if((v-acc)<0){
                        v=0;
                    }
                    else{
                        v-=acc;
                    }
                    result+=v;
                }
            }
            System.out.println("#"+t+" "+result);
        }
    }
}
