import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class L2_1285 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        for(int i=1; i<=test_case; i++){
            int peoplenum= Integer.parseInt(br.readLine());
            int[] num1=new int[peoplenum];
            int[] num2=new int[peoplenum];
            int min=100001, same_people=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<peoplenum; j++){
                num1[j]=Integer.parseInt(st.nextToken());
                num2[j]=Math.abs(0-num1[j]);
                if(num2[j]<min){
                    min=num2[j];
                    same_people=1;
                }
                else if(num2[j]==min) same_people++;
            }
            System.out.println("#"+i+" "+min+" "+same_people);
        }
    }
}
