import java.util.Scanner;

public class L2_1954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 수 입력
        int test_case = sc.nextInt();

        // 각 테스트 케이스 실행
        for (int t = 1; t <= test_case; t++) {
            // 현재 테스트 케이스의 행렬 크기 입력
            int size = sc.nextInt();

            // 주어진 크기의 2차원 배열 초기화
            int[][] num = new int[size][size];

            // 초기에는 모든 배열 값을 0으로 설정
            for (int i = 0; i < size; i++)
                for (int j = 0; j < size; j++)
                    num[i][j] = 0;

            // 첫 번째 숫자 1로 시작
            num[0][0] = 1;

            // 각 방향의 경계를 설정
            int width = size - 1;
            int length = size - 1;
            int min_width = 0, min_length = 1;

            // 시작 위치 설정
            int currentx = 0, currenty = 0;

            // 현재 방향을 나타내는 변수 (1 = 오른쪽, 2 = 아래, 3 = 왼쪽, 4 = 위)
            int where = 1;

            // 2부터 행렬의 크기 제곱까지 숫자를 채움
            for (int i = 2; i <= size * size;) {
                if (where == 1) { // 오른쪽으로 이동
                    num[currenty][++currentx] = i++;
                    if (currentx == width) { // 오른쪽 경계에 도달하면 아래로 방향 변경
                        where = 2;
                        width--;
                    }
                } else if (where == 2) { // 아래로 이동
                    num[++currenty][currentx] = i++;
                    if (currenty == length) { // 아래쪽 경계에 도달하면 왼쪽으로 방향 변경
                        where = 3;
                        length--;
                    }
                } else if (where == 3) { // 왼쪽으로 이동
                    num[currenty][--currentx] = i++;
                    if (currentx == min_width) { // 왼쪽 경계에 도달하면 위로 방향 변경
                        where = 4;
                        min_width++;
                    }
                } else if (where == 4) { // 위로 이동
                    num[--currenty][currentx] = i++;
                    if (currenty == min_length) { // 위쪽 경계에 도달하면 오른쪽으로 방향 변경
                        where = 1;
                        min_length++;
                    }
                }
            }

            // 출력 형식에 맞게 결과를 출력
            System.out.println("#" + t);
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++)
                    System.out.printf("%d ", num[i][j]);
                System.out.println();
            }
        }
    }
}
