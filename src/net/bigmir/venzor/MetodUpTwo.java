package net.bigmir.venzor;

public class MetodUpTwo {

	public static void main(String[] args) {

		int a = 999;
		int b = 999;
		for (int i = 999; i >= 100; i--) {
			a = i;
			for (int j = 999; j >= 100; j--) {
				b = j;
				if (palindrom(a, b))
					break;
			}
			if (palindrom(a, b))
				break;
		}
		System.out.println("произведение чисел " + a + " и " + b + " дает палиндром " + (a * b));

	}

	static boolean palindrom(int a, int b) {
		boolean f = false;
		int r1 = a * b / 100000;
		int r2 = a * b % 100000 / 10000;
		int r3 = a * b % 10000 / 1000;
		int r4 = a * b % 1000 / 100;
		int r5 = a * b % 100 / 10;
		int r6 = a * b % 10;
		if (r1 != 0 && r1 == r6 && r2 == r5 && r3 == r4) {
			f = true;
		} else if (r1 == 0 && r2 == r6 && r3 == r5) {
			f = true;
		}
		return f;
	}

}
