import java.util.Scanner;
import java.util.Arrays;
public class L1_2063 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int[] num=new int[T];
        for(int test_case=0; test_case<T; test_case++){
            num[test_case]=sc.nextInt();
        }
        Arrays.sort(num);
        System.out.println(num[T/2]);
    }
}
