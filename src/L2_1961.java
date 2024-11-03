import java.util.Scanner;

public class L2_1961 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case=sc.nextInt();
        for(int t=1; t<=test_case; t++){
            int num=sc.nextInt();
            int[][] num_print=new int[num][num];

            for(int i=0; i<num; i++)
                for(int j=0; j<num; j++)
                    num_print[i][j]=sc.nextInt();

            int max_width=num-1, max_length=num-1;
            System.out.println("#"+t);
            for(int i=0; i<num; i++){
                for(int first=max_length; first>=0; first--){
                    System.out.print(num_print[first][i]);
                }
                System.out.print(" ");

                for(int second=max_width; second>=0; second--){
                    System.out.print(num_print[max_width-i][second]);
                }
                System.out.print(" ");

                for(int third=0; third<=max_length; third++){
                    System.out.print(num_print[third][max_length-i]);
                }
                System.out.println();
            }
        }
    }
}
