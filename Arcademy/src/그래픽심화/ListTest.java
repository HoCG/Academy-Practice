package 그래픽심화;

import java.awt.*;

public class ListTest {
	public static void main(String[] args)  {   //선택창과 다른점이 있다면 많은 정보를 담을수 있다는 점이 있다.
		Frame f = new Frame("List - Select");
		f.setSize(300,200);
		f.setLayout(null); //안써요..ㅎㅎ
		
		List selectOne = new List(6);          //6개의 목록을 보여줄수있는 크기의 List 생성.
		selectOne.setLocation(20,40);
		selectOne.setSize(100,200);
		selectOne.add("Student");
		selectOne.add("Teacher");
		selectOne.add("Driver");
		selectOne.add("Computer programmer");
		selectOne.add("Sales Man");
		selectOne.add("Director");
		
		List selectMany = new List(6,true);    //true를 쓰면 여러개의 항목을 선택할수있다.
		selectMany.setLocation(150,40);
		selectMany.setSize(100,120);
		selectMany.add("Student");
		selectMany.add("Student2");
		selectMany.add("Student3");
		selectMany.add("Student4");
		selectMany.add("Student5");
		selectMany.add("Student6");
		selectMany.add("Student7");
		
		f.add(selectOne);     //나 이거쓸게!! 하는거임.
		f.add(selectMany);
		f.setVisible(true);
		
	}

}
