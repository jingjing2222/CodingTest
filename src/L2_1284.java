import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L2_1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        int P,Q,R,S,W;
        int price1=0, price2=0, totalPrice=0;
        for(int i=1; i<=test_case; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            P=Integer.parseInt(st.nextToken());
            Q=Integer.parseInt(st.nextToken());
            R=Integer.parseInt(st.nextToken());
            S=Integer.parseInt(st.nextToken());
            W=Integer.parseInt(st.nextToken());

            price1=P*W;

            if(W<=R){
                price2=Q;
            }
            else{
                price2=Q+S*(W-R);
            }
            if(price1>=price2) totalPrice=price2;
            else totalPrice=price1;
            System.out.println("#"+i+" "+totalPrice);
        }
    }
}
