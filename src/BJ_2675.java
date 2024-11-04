import java.util.Scanner;

public class BJ_2675 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case=sc.nextInt();
        for(int t=1; t<=test_case; t++){
            int n=sc.nextInt();
            String s = sc.nextLine();
            s=s.trim();
            char[] c=s.toCharArray();
            for(int i=0; i<c.length; i++){
                for(int j=0; j<n; j++){
                    System.out.print(c[i]);
                }
            }
            System.out.println();
        }
    }
}
