package 여러함수와그래픽과쓰레드;

import java.util.*;
import java.text.*;

public class ChoiceFormat1 { // 숫자 순서 정리.
	public static void main(String[] args) {
		double[] limits = { 60, 70, 80, 90 };     // 낮은값부터 큰값의 순서로 작성.
		String[] grades = { "D", "C", "B", "A" }; // 넘어가면서 제자리로 돌아옴. limits grades간의 순서 개수 정리 잘해야한다.
		int[] scores = { 100, 95, 88, 70, 52, 60, 70 };
		ChoiceFormat form = new ChoiceFormat(limits, grades);

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + ":" + form.format(scores[i]));
		}
	}
}
