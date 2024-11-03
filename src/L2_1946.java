import java.util.Scanner;

public class L2_1946 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case=sc.nextInt();
        for(int t=1; t<=test_case; t++){
            int num=sc.nextInt();
            char[] c = new char[num];
            int[] number= new int[num];
            for(int i=0; i<num; i++){
                c[i]=sc.next().charAt(0);
                number[i]=sc.nextInt();
            }
            int num2=0;
            System.out.printf("#%d\n",t);
            for(int i=0; i<num; ){
                System.out.printf("%c",c[i]);
                if(--number[i]==0) i++;
                if((++num2%10)==0) System.out.println();
            }
            System.out.println();
        }
    }
}
