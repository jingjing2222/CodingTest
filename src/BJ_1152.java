import java.util.Scanner;

public class BJ_1152 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        s=s.trim();
        int count=1;
        int num=0;
        if(s.length()==0){
            count=0;
            System.out.println(count);
        }
        else {
            while (s.indexOf(" ", num + 1) != -1) {
                num = s.indexOf(" ", num + 1);
                count++;
            }
            System.out.println(count);
        }
    }
}
