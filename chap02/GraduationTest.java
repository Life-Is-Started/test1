package chap02;

import java.util.Scanner;

public class GraduationTest {asdfasdf

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("���� �̼� ����: ");
		int major = in.nextInt();
		System.out.print("���� �̼� ����: ");
		int liberal = in.nextInt();
		System.out.print("�Ϲ� �̼� ����: ");
		int general = in.nextInt();

		boolean b = ((major + liberal + general) >= 140)
				&& ((liberal >= 30 && general >= 30) || (liberal + general >= 80));
		System.out.println(b ? "���� ����" : "���� �Ұ�");

	}

}