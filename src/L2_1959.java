import java.util.Scanner;

public class L2_1959 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case=sc.nextInt();
        for(int t=1; t<=test_case; t++){
            int max=0;
            int total=0;
            int num1=sc.nextInt();
            int[] num_1=new int[num1];
            int num2=sc.nextInt();
            int[] num_2=new int[num2];
            for(int i=0; i<num1; i++) num_1[i]=sc.nextInt();
            for(int i=0; i<num2; i++) num_2[i]=sc.nextInt();
            if(num1<=num2){
                for(int i=0; i<=num2-num1; i++){
                    for(int j=0; j<num1; j++){
                        total+=(num_1[j]*num_2[j+i]);
                    }
                    if(max<=total) max=total;
                    total=0;
                }
            }
            else{
                for(int i=0; i<num1-num2; i++){
                    for(int j=0; j<num2; j++){
                        total+=(num_1[j+i]*num_2[j]);
                    }
                    if(max<=total) max=total;
                    total=0;
                }
            }
            System.out.printf("#%d %d\n",t,max);
        }
    }
}
