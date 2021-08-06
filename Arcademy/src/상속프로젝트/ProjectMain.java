package 상속프로젝트;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProjectMain {
	Scanner scan = new Scanner(System.in);
	int count = 0;
	public PeopleCare StuList[] = null;
	int StuNumber;
	String name;
	int CallNum;
	String place;
	int Money;
	int Score;

	public static void main(String[] args) {
		ProjectMain p = new ProjectMain();
		p.menu();
	}

	void menu() {
		readPeople();
		PeopleCare p = new PeopleCare();
		while (true) {
			System.out.println("======== 인적사항 관리 메뉴 ========");
			System.out.println("1. 인적사항 관리");
			System.out.println("2. 학생 등록금 관리");
			System.out.println("3. 학생 점수 관리");
			System.out.println("=============================");
			int n = scan.nextInt();
			switch (n) {
			case 1:
				p.menu();
				break;
			case 2:

				break;
			case 3:

				break;
			}
			if (n == 3)
				break;
		}

	}

	void readPeople() {
		Scanner filein = openFile("Student.txt");
		filein.nextLine();
		StuList = new PeopleCare[20];
		while (filein.hasNext()) {
			StuList[count] = new PeopleCare();
			StuList[count].read(filein);
			count++;
		}
		filein.close();
	}

	void read(Scanner scan) {
		StuNumber = scan.nextInt();
		name = scan.next();
		CallNum = scan.nextInt();
		place = scan.next();
		Money = scan.nextInt();
		Score = scan.nextInt();
	}

	Scanner openFile(String filename) {
		File f = new File(filename);
		Scanner s = null;
		try {
			s = new Scanner(f);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		return s;
	}
}
