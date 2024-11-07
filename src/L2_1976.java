import java.util.Scanner;

public class L2_1976 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int test_case=sc.nextInt();

        for(int t=1; t<=test_case; t++){
            int hh1=sc.nextInt();
            int mm1=sc.nextInt();
            int hh2=sc.nextInt();
            int mm2=sc.nextInt();
            int total_hh=hh1+hh2;
            int total_mm=mm1+mm2;
            if(total_mm>59){
                total_hh++;
                total_mm%=60;
            }
            if(total_hh>12){
                total_hh-=12;
            }
            System.out.printf("#%d %d %d\n",t,total_hh,total_mm);

        }
    }
}
