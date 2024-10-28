import java.util.Scanner;
public class L1_2056 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        int yy=0,mm=0,dd=0;
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        for(int test_case=1; test_case<=T; test_case++) {
            String s = sc.nextLine();
            yy = Integer.parseInt(s.substring(0, 4));
            mm = Integer.parseInt(s.substring(4, 6));
            dd = Integer.parseInt(s.substring(6, 8));
            if(yy>=0) {
                if (mm > 0 && mm < 13) {
                    if (dd > 0 && dd <= days[mm-1]) {
                        System.out.printf("#%d %04d/%02d/%02d\n",test_case,yy,mm,dd);
                    }
                    else System.out.println("#"+test_case+" -1");
                }
                else System.out.println("#"+test_case+" -1");
            }
        }
    }
}
