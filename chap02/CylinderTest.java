package chap02;

import java.util.Scanner;

public class CylinderTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("������� �ظ��� ��������? ");
		double r = in.nextDouble();
		System.out.print("������� ���̴�? ");
		double h = in.nextDouble();
		System.out.println("������� ���Ǵ� " + 3.14 * r * r * h);
	}
}