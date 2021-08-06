
public class StaticBlock {
	static int[] arr = new int[10]; 
	
	static { //초기화 블럭으로만 해결. 초기화 블럭의 활용부 공부!!
		for(int i=0;i<arr.length;i++)
			arr[i]=(int)(Math.random()*10)+1;
	}
	public static void main(String[] args) { //생성자 역할을 초기화블럭으로 해결. 실행을 안했는데 초기화 블럭으로 인해 진행.
		for(int i=0;i<arr.length;i++)
			System.out.println("arr["+i+"] :"+arr[i]);
	}
}
