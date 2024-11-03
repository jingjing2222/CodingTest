import java.util.Scanner;

public class L2_1945 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case=sc.nextInt();
        for(int t=1; t<=test_case; t++){
            int num=sc.nextInt();
            int[] n=new int[5];
            for(int i=0; i<5; i++) n[i]=0;
            while(num!=0){
                if(num%11==0){
                    num/=11;
                    n[4]++;
                }
                else if(num%7==0){
                    num/=7;
                    n[3]++;
                }
                else if(num%5==0){
                    num/=5;
                    n[2]++;
                }
                else if((num%3)==0){
                    num/=3;
                    n[1]++;
                }
                else if((num%2)==0){
                    num /= 2;
                    n[0]++;
                }
                else break;
            }
            System.out.printf("#%d %d %d %d %d %d\n",t,n[0],n[1],n[2],n[3],n[4]);
        }
    }
}
