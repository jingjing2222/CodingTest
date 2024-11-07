import java.util.Scanner;

public class L2_1974 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();

        for (int t = 1; t <= test_case; t++) {
            int[][] num = new int[9][9];
            int result = 1;
            int[] check = new int[9];

            for (int i = 0; i < 9; i++)  for (int j = 0; j < 9; j++) num[i][j] = sc.nextInt();


            for (int i = 0; i < 9; i++) {
                for (int k = 0; k < 9; k++) check[k] = 0;
                for (int j = 0; j < 9; j++) {
                    if (check[num[i][j] - 1] == 1) {
                        i=8;
                        result = 0;
                        break;
                    } else check[num[i][j] - 1] = 1;
                }
            }

            if(result == 1) {
                for (int i = 0; i < 9; i++) {
                    for (int k = 0; k < 9; k++) check[k] = 0;
                    for (int j = 0; j < 9; j++) {
                        if (check[num[j][i] - 1] == 1) {
                            i=8;
                            result = 0;
                            break;
                        } else check[num[j][i] - 1] = 1;
                    }
                }
            }
            if(result == 1) {
                for (int i = 0; i < 9; i += 3) {
                    for (int j = 0; j < 9; j += 3) {
                        for (int k = 0; k < 9; k++) check[k] = 0;
                        for (int l = i; l < (i + 3); l++) {
                            for (int n = j; n < (j + 3); n++) {
                                if (check[num[l][n] - 1] == 1) {
                                    l=100;
                                    j=8;
                                    i=8;
                                    result = 0;
                                    break;
                                } else
                                    check[num[l][n] - 1] = 1;
                            }
                        }
                    }
                }
            }
            for (int k = 0; k < 9; k++) {check[k] = 0;}
                System.out.printf("#%d %d\n",t,result);
        }
    }
}