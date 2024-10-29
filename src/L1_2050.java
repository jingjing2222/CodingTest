import java.util.Scanner;
public class L1_2050 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] c= sc.nextLine().toCharArray();
        for (char value : c) {
            System.out.print((int) (value - 'A' + 1) + " ");
        }
    }
}
