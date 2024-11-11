import java.util.Arrays;
import java.util.Scanner;

public class D3_1206 {
    public static void solve(){
        Scanner sc=new Scanner(System.in);
        for(int t=1; t<=10; t++){
            int num=sc.nextInt();

            int[] height=new int[num];
            int result=0;

            for(int i=0; i<num; i++) height[i]=sc.nextInt();

            int[] compare=new int[4];
            for(int i=0; i<4; i++) compare[i]=0;

            for(int i=2; i<num-2; i++){
                compare[0]=height[i]-height[i-2];
                compare[1]=height[i]-height[i-1];
                compare[2]=height[i]-height[i+1];
                compare[3]=height[i]-height[i+2];
                if(compare[0]<0 || compare[1]<0 || compare[2]<0 || compare[3]<0){
                    result += 0;
                }
                else {
                    Arrays.sort(compare);
                    result+=compare[0];
                }
            }
            System.out.println("#"+t+" "+result);
        }
    }


    public static void main(String[] args){
        solve();
    }

}
