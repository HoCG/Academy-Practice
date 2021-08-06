package 인터페이스와예외;

import java.util.Arrays;

public class CloneEx { // 패키지와 유용한 클래스(클론)배열복제.
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arrClone = arr.clone();        //.clone();으로 arr의 내용을 복사한다.
		// int[] arrClone = arr 을 하게되면 주소만 가는것이기 때문에 arr이 바뀌면 arrClone도 바뀐다.(깊은복사.)메모리상 따로.
		// arrClone=arr; (얕은 복사) 같은곳을 사용.
		arrClone[0] = 6;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}
}
