import java.util.Scanner;

public class BJ_2908 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String[] st=s.split(" ");
        StringBuilder sb1= new StringBuilder(new String(st[0]));
        StringBuilder sb2= new StringBuilder(new String(st[1]));
        sb1.reverse();
        sb2.reverse();
        int num1=Integer.parseInt(String.valueOf(sb1));
        int num2=Integer.parseInt(String.valueOf(sb2));
        if(num1>=num2) System.out.println(num1);
        else System.out.println(num2);
    }
}
