package 상속프로젝트;

class PeopleCare extends ProjectMain {

	// 객체의 변수들.

	void menu() {
		while (true) {
			System.out.println("======== 인적사항 관리 메뉴 ========");
			System.out.println("1. 인적사항 조회");
			System.out.println("2. 인적사항 수정");
			System.out.println("3. 이전 메뉴");
			System.out.println("=============================");
			int n = scan.nextInt();
			switch (n) {
			case 1:
				PeoplePrint();
				break;
			case 2:
				PeopleChange();
				break;
			}
			if (n == 3)
				break;
		}
	}

	void PeoplePrint() {
		for (int i = 0; i < 15; i++) {
			System.out.println((i + 1) + ". " + StuList[i].StuNumber + " " + StuList[i].name);
		}
	}

	void PeopleChange() {
	}

}
