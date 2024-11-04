import java.util.Scanner;

public class BJ_9086 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case=sc.nextInt();
        sc.nextLine();
        for(int t=1; t<=test_case; t++){
            String s=sc.nextLine();
            char[] c=s.toCharArray();
            System.out.printf("%c%c\n",c[0],c[c.length-1]);
        }
    }
}
