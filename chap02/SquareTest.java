package chap02;

import java.util.Scanner;

public class SquareTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� : ");
		int i = in.nextInt();
		System.out.printf("%d�� ������ %d\n", i, i * i);
	}
}