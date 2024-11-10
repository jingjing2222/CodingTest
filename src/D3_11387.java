import java.util.Scanner;

public class D3_11387 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case=sc.nextInt();
        for(int t=1; t<=test_case; t++){
            long d=sc.nextInt();
            long l=sc.nextInt();
            long n=sc.nextInt();
            long total_damage=0;
            for(int i=0; i<n; i++){
                total_damage+=d+(d*l*i)/100;
            }
            System.out.printf("#%d %d\n",t,total_damage);
        }
    }
}
