package chap02;

import java.util.Scanner;

public class DigitSumTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("0~999 ������ ���ڸ� �Է��ϼ��� : ");
		int x = in.nextInt();

		int d, sum;
		sum = x % 10;
		x /= 10;
		sum += x % 10;
		x /= 10;
		sum += x % 10;
		x /= 10;
		System.out.println("�� �ڸ����� �� = " + sum);
	}
}
