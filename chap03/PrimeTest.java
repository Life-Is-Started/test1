package chap03;

import java.util.Scanner;

public class PrimeTest {
	static boolean isPrime(int x) {
		int temp;
		for (int i = 2; i <= x / 2; i++) {
			temp = x % i;
			if (temp == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		System.out.print("���� ������ �Է��ϼ��� : ");
		int num = new Scanner(System.in).nextInt();

		if (isPrime(num))
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		else
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
	}
}
