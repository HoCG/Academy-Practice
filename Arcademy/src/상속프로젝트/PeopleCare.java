package ���������Ʈ;

class PeopleCare extends ProjectMain {

	// ��ü�� ������.

	void menu() {
		while (true) {
			System.out.println("======== �������� ���� �޴� ========");
			System.out.println("1. �������� ��ȸ");
			System.out.println("2. �������� ����");
			System.out.println("3. ���� �޴�");
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
