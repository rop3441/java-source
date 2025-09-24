package basic;

import java.util.Scanner;

// system.in : 키보드
// system.out : 화면

public class ScannerEx4 {
    public static void main(String[] args) {
        // 키보드에서 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자입력");

        // 입력받기 : sc.nextline() ==> ""
        // "" 을 없애야 한다면 : integer.parseInt or parseFloat or double.parseDouble
        // int num1 = sc.nextInt(); // 35 엔터
        int input1 = Integer.parseInt(sc.nextLine());
        // Float input1 = Float.parseFloat(sc.nextLine());
        // double input1 = double.parseDouble(sc.nextline());

        System.out.print("연산자 입력 : "); // +,-,*,/
        String op = sc.nextLine();

        System.out.print("두번째 숫자입력 : ");
        int input2 = Integer.parseInt(sc.nextLine());
        // int num2 = sc.nextInt();
        System.out.println(op);
        System.out.println(input1 + input2);
        sc.close();

    }
}
