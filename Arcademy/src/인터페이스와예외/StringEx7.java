package 인터페이스와예외;

public class StringEx7 {
	public static void main(String[] args) { // 패키지와 유용한 클래스. 파일 타입 탐색.
		String fullName = "Hello.java";
		int index = fullName.indexOf('.'); //위치를 알아내고.
		String fileName = fullName.substring(0,index);  //4번자리까지 (hello)를 가지고옴. filename에 넣음. substring으로 뽑아냄.
		String ext = fullName.substring(index+1); //인덱스 부터, 끝까지
		System.out.println(fullName+"의 확장자를 제외한 이름은 "+fileName);
		System.out.println(fullName+"의 확장자는 "+ext);
	}

}
