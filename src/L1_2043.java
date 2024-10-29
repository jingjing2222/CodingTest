import java.util.Scanner;
public class L1_2043 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        if(n1>999||n1<0||n2>999||n1<0) System.out.println("-1");
        else System.out.println(n1-n2+1);
    }
}
