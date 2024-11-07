import java.util.Arrays;
import java.util.Scanner;

public class L2_1966 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case=sc.nextInt();
        for(int t=1; t<=test_case; t++){
            int num=sc.nextInt();
            int[] num_sort=new int[num];

            for(int i=0; i<num; i++){
                num_sort[i]=sc.nextInt();
            }
            Arrays.sort(num_sort);
            System.out.printf("#%d ",t);
            for(int i=0; i<num; i++){
                System.out.print(num_sort[i]+" ");
            }
            System.out.println();
        }
    }
}
