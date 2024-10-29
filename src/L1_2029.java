import java.util.Scanner;

public class L1_2029 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        for(int i=1; i<=t; i++){
            int n1= sc.nextInt();
            int n2= sc.nextInt();
            System.out.println("#"+i+" "+(n1/n2)+" "+(n1%n2));
        }
    }
}
