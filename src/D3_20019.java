import java.util.Scanner;

public class D3_20019 {
    public static boolean isPalindrome(String s, int start, int end) {
        // 주어진 부분 문자열이 회문인지 확인하는 메서드
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean solve(String s) {
        int len = s.length();
        int totalCenter = len / 2;
        int firstCenter = totalCenter / 2;
        int secondCenter = totalCenter + 1 + firstCenter;

        // 홀수 길이일 때만 검사
        if (len % 2 == 1) {
            // 전체 회문 검사
            if (isPalindrome(s, 0, len - 1)) {
                // 좌측 및 우측 각각 회문 검사
                if (isPalindrome(s, 0, totalCenter - 1) &&
                        isPalindrome(s, totalCenter + 1, len - 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();

        for (int t = 1; t <= testCase; t++) {
            String s = sc.nextLine().trim();
            if (s.length() >= 3 && s.length() <= 99) {
                if (solve(s)) {
                    System.out.printf("#%d YES\n", t);
                } else {
                    System.out.printf("#%d NO\n", t);
                }
            } else {
                System.out.printf("#%d NO\n", t);
            }
        }
    }
}
