package 프로젝트;

import java.io.*;
import java.util.*;

public class Main { // 수정을 요함.
	Scanner scan = new Scanner(System.in);
	StringBuffer s = new StringBuffer(190);// 미리 사이즈 지정하여 속도Up[출처] 자바 하위디렉토리 포함 파일 일괄수정|작성자 르셀
	FileOutputStream out;
	Main[] proList = null;
	int pronum[] = new int[6];
	// 상품이가지는 고유 변수들.
	String name;
	int price;
	int count = 0;
	int procount;

	// 상품의 갯수
	int Newcount = 0;
	int NewNumcount = 0;

	// 상품계산을 위한 변수들
	int fullcount = 0;
	int id;
	int Pcount;
	int Bill;
	int NewBill;
	int Kbill;

	public static void main(String[] args){
		Main a = new Main();
		a.Menu();
	}
	
	//파일 출력방법.
	public void writeFile() {
		File f = new File("ProductNumber.txt");
		PrintWriter pw;
		try {
			pw = new PrintWriter(f);
			for (int i = 0; i < Newcount; i++) {
				pw.printf("\n%d", pronum[i]);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


	//메뉴창
	void Menu() {
		readProductNumber();
		readProduct();
		while (true) {
			System.out.println("========메인 메뉴========");
			System.out.println("1. 상품판매");
			System.out.println("2. 재고관리");
			System.out.println("3. 종료");
			System.out.println("======================\n");
			System.out.println("어떤 업무를 하시겠습니까?");
			int n = scan.nextInt();
			switch (n) {
			case 1:
				mymain();
				break;
			case 2:
				CareProduct();
				break;
			}
			if (n == 3)
				break;
		}
		writeFile();
	}


	//재고 관리 메뉴
	void CareProduct() {
		while (true) {
			System.out.println("\n========재고 관리========");
			System.out.println("1. 재고조회");
			System.out.println("2. 상품입고");
			System.out.println("3. 상품반품");
			System.out.println("4. 이전메뉴");
			System.out.println("======================\n");
			System.out.println("어떤 업무를 하시겠습니까?  ");
			int n = scan.nextInt();
			switch (n) {
			case 1:
				printProductNumber();
				break;
			case 2:
				plusProductNumber();
				break;
			case 3:
				deleteProductNumber();
				break;
			}
			if (n == 4)
				break;
		}
	}

	//재고 출력
	void printProductNumber() {
		for (int i = 0; i < Newcount; i++) {
			System.out.println((i + 1) + ". " + "상품명: " + proList[i].name + "\t\t개수: " + pronum[i]);
		}

	}

	//물품 입고
	void plusProductNumber() {
		Print();
		System.out.println("\n입고하실 상품 번호를 작성해주세요: ");
		int kwd = scan.nextInt();
		System.out.println("입고하실 상품 개수를 작성해주세요: ");
		int n = scan.nextInt();
		System.out.println("\n");
		pronum[kwd-1] += n;
		System.out.println("입고하신 " + proList[kwd-1].name + " 상품의 개수는 " + pronum[kwd-1] + "개입니다.");

	}

	//물품 반품
	void deleteProductNumber() {
		Print();
		System.out.println("\n반품하실 상품 번호를 작성해주세요: ");
		int kwd = scan.nextInt();
		System.out.println("반품하실 상품 개수를 작성해주세요: "); // 번호로 처리하기.
		int n = scan.nextInt();
		System.out.println("\n");
		pronum[kwd-1] -= n;
		System.out.println("반품하신 " + proList[kwd-1].name + " 상품의 개수는 " + pronum[kwd-1] + "개입니다.");

	}

	void read(Scanner scan) {
		name = scan.next();
		price = scan.nextInt();
	}

	void readProductNumber() {

		Scanner filein = openFile("ProductNumber.txt");
		filein.nextLine();
		while (filein.hasNext()) {
			procount = filein.nextInt();
			pronum[NewNumcount] = procount;
			NewNumcount++;
		}
		filein.close();
	}

	void readProduct() {
		Scanner filein = openFile("Product.txt");
		filein.nextLine();
		proList = new Main[20];
		while (filein.hasNext()) {
			proList[Newcount] = new Main();
			proList[Newcount].read(filein);
			Newcount++;
		}
		filein.close();
	}

	void fullPrice() {
		System.out.println("구매하신 총금액은 " + fullcount + "원 입니다.");
		NewBill = fullcount;
		while (true) {
			System.out.println("결제금액을 입금해주세요!");
			System.out.println("결제금액:");
			int Bill = scan.nextInt();
			Kbill += Bill;
			if (NewBill - Bill > 0) {
				System.out.println("결제금액에서 " + (NewBill - Bill) + "원이 부족합니다.");
				NewBill -= Bill;
			} else
				break;
		}
		System.out.println("======== 영 수 증 ========");
		for (int i = 0; i < Newcount; i++)
			if (proList[i].count > 0) {
				System.out.println(proList[i].name + "\t" + proList[i].count + "개" + "\t"
						+ (proList[i].count) * (proList[i].price) + "원");
			}
		System.out.println("======================");
		System.out.println("총구매금액 \t\t" + fullcount + "원");
		System.out.println("받은금액 \t\t" + Kbill + "원");
		System.out.println("거스름돈\t\t" + (Kbill - fullcount) + "원\n\n\n");
	}

	void Print() {
		System.out.println("======== 상품 메뉴 ========");
		for (int i = 0; i < Newcount; i++) {
			System.out.printf("%d", i + 1);
			System.out.printf(".%s\t\t%d원\n", proList[i].name, proList[i].price);
		}
	}

	void firstCount() {
		while (pronum[id] > 0) {
			System.out.println("어떤상품을 구매하시겠습니까?");
			id = scan.nextInt();
			id--;
			System.out.println(proList[id].name + "를 선택하셨습니다.");
			if (pronum[id] <= 0) {
				System.out.println("선택하신 상품의 재고가 없습니다. 다시 선택해주세요.");
				break;
			}
			System.out.println("단가는 " + proList[id].price + "원 입니다.");
			System.out.println("몇개를 구입하시겠습니까?");
			Pcount = scan.nextInt();
			System.out.println("구매하신 금액은 " + proList[id].price * Pcount + "원 입니다.");
			fullcount += proList[id].price * Pcount;
			proList[id].count += Pcount;
			pronum[id] -= Pcount;
			break;
		}
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

	void mymain() {
		while (true) {
			Print();
			firstCount();
			System.out.println("더 구매하시겠습니까? (예: 1/Y, 아니오: 0/N)");
			String kwd = scan.next();
			if (kwd.equals("Y"))
				continue;
			if (kwd.equals("1"))
				continue;
			else if (kwd.equals("N")) {
				fullPrice();
				break;
			} else if (kwd.equals("0")) {
				fullPrice();
				break;
			}
		}
	}
}
