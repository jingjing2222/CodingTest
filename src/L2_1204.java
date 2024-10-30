import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L2_1204 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<=T; i++){
            i=sc.nextInt();
            List<Integer> list = new ArrayList<>(101);
            for(int k=0; k<101; k++) list.add(0);
            for(int j=0; j<1000; j++){
                int num=sc.nextInt();
                int valueOflist=list.get(num);
                list.set(num,++valueOflist);
                if(j==999){
                    System.out.println("#"+i+" "+list.lastIndexOf(Collections.max(list)));
                }
            }
        }
    }
}
