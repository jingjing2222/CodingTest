import java.util.Scanner;

public class L2_1948 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case=sc.nextInt();
        int[] month={31,28,31,30,31,30,31,31,30,31,30,31};
        for(int t=1; t<=test_case; t++){
            int total_day1=0, total_day2=0;
            int[] num1=new int[2];
            int[] num2=new int[2];
            num1[0]=sc.nextInt();
            num1[1]=sc.nextInt();
            num2[0]=sc.nextInt();
            num2[1]=sc.nextInt();
            for(int i=0; i<num1[0]-1; i++){
                total_day1+=month[i];
            }
            total_day1+=num1[1];
            for(int i=0; i<num2[0]-1; i++){
                total_day2+=month[i];
            }
            total_day2+=num2[1];
            System.out.printf("#%d %d\n",t,(total_day2-total_day1+1));

        }
    }
}
