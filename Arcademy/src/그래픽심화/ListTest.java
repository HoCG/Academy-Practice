package �׷��Ƚ�ȭ;

import java.awt.*;

public class ListTest {
	public static void main(String[] args)  {   //����â�� �ٸ����� �ִٸ� ���� ������ ������ �ִٴ� ���� �ִ�.
		Frame f = new Frame("List - Select");
		f.setSize(300,200);
		f.setLayout(null); //�Ƚ��..����
		
		List selectOne = new List(6);          //6���� ����� �����ټ��ִ� ũ���� List ����.
		selectOne.setLocation(20,40);
		selectOne.setSize(100,200);
		selectOne.add("Student");
		selectOne.add("Teacher");
		selectOne.add("Driver");
		selectOne.add("Computer programmer");
		selectOne.add("Sales Man");
		selectOne.add("Director");
		
		List selectMany = new List(6,true);    //true�� ���� �������� �׸��� �����Ҽ��ִ�.
		selectMany.setLocation(150,40);
		selectMany.setSize(100,120);
		selectMany.add("Student");
		selectMany.add("Student2");
		selectMany.add("Student3");
		selectMany.add("Student4");
		selectMany.add("Student5");
		selectMany.add("Student6");
		selectMany.add("Student7");
		
		f.add(selectOne);     //�� �̰ž���!! �ϴ°���.
		f.add(selectMany);
		f.setVisible(true);
		
	}

}
