package net.bigmir.venzor;

import java.util.Scanner;

public class MetodUpOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("введите последовательность через запятую (минимум 4 значения):");
		String text = sc.nextLine();

		String[] t = text.split("[,]");

		double[] a = new double[t.length];

		for (int i = 0; i < a.length; i++) {
			a[i] = new Double(t[i]);
		}

		if (a.length >= 4) {
			nextOne(a);
		} else {
			System.out.println("введено недостаточно элементов");
		}

	}

	static double comparOne(double[] array) {
		boolean f = false;
		double a = 0;
		int i = 1;
		do {
			if ((array[i] - array[i - 1]) == (array[i + 1] - array[i])) {
				f = true;
			} else {
				f = false;
			}
			i++;
		} while (f && i < array.length - 1);
		if (f) {
			a = array[2] - array[1];
		}
		return a;

	}

	static double compareTwo(double[] array) {
		boolean f = false;
		double a = 0;
		int i = 1;
		do {
			if ((array[i] / array[i - 1]) == (array[i + 1] / array[i])) {
				f = true;
			} else {
				f = false;
			}
			i++;
		} while (f && i < array.length - 1);
		if (f) {
			a = array[2] / array[1];
		}
		return a;

	}

	static double compareThree(double[] array) {
		boolean f = false;
		double a = 0;
		int i = 1;
		do {
			if (Math.log(array[i]) / Math.log(i + 1) == Math.log(array[i + 1]) / Math.log(i + 2)) {

				f = true;
			} else {
				f = false;
			}
			i++;
		} while (f && i < array.length - 1);
		if (f) {
			a = Math.log(array[1]) / Math.log(2);
		}
		return a;

	}

	static void nextOne(double[] array) {
		if (comparOne(array) != 0) {
			double next = array[array.length - 1] + comparOne(array);
			System.out.println("следующий элемент последовательности: " + String.format("%.0f", next));
		} else if (compareTwo(array) != 0) {
			double next = array[array.length - 1] * compareTwo(array);
			System.out.println("следующий элемент последовательности: " + String.format("%.0f", next));
		} else if (compareThree(array) != 0) {
			double next = Math.pow((array.length + 1), compareThree(array));
			System.out.println("следующий элемент последовательности: " + String.format("%.0f", next));
		} else {
			System.out.println("Введена неверная последовательность");
		}
	}

}
