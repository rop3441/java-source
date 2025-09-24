package operator;

import java.util.Scanner;

public class eratorEX7 {
    public static void main(String[] args) {
        // 키보드에서 숫자를 하나 입력받기
        Scanner sr = new Scanner(System.in);
        System.out.print("30");
        int num = Integer.parseInt(sr.nextLine());

        // 입력받은 숫자가 양수, 음수인지는 출력하기
        System.out.println(num > 0 ? "양수" : "음수");
    }
}
