package �����Լ��ͱ׷��Ȱ�������;

import java.util.*;
import java.text.*;

public class ChoiceFormat1 { // ���� ���� ����.
	public static void main(String[] args) {
		double[] limits = { 60, 70, 80, 90 };     // ���������� ū���� ������ �ۼ�.
		String[] grades = { "D", "C", "B", "A" }; // �Ѿ�鼭 ���ڸ��� ���ƿ�. limits grades���� ���� ���� ���� ���ؾ��Ѵ�.
		int[] scores = { 100, 95, 88, 70, 52, 60, 70 };
		ChoiceFormat form = new ChoiceFormat(limits, grades);

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + ":" + form.format(scores[i]));
		}
	}
}
