import java.util.Scanner;
public class L1_2071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T=scanner.nextInt();
        int sum=0;
        for(int i=1; i<=T; i++) {
            for (int j = 0; j < 10; j++) {
                sum += scanner.nextInt();
            }
            System.out.println("#"+i+" "+Math.round(sum/10.0));
            sum=0;
        }

    }
}
