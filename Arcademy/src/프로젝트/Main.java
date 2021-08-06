package ������Ʈ;

import java.io.*;
import java.util.*;

public class Main { // ������ ����.
	Scanner scan = new Scanner(System.in);
	StringBuffer s = new StringBuffer(190);// �̸� ������ �����Ͽ� �ӵ�Up[��ó] �ڹ� �������丮 ���� ���� �ϰ�����|�ۼ��� ����
	FileOutputStream out;
	Main[] proList = null;
	int pronum[] = new int[6];
	// ��ǰ�̰����� ���� ������.
	String name;
	int price;
	int count = 0;
	int procount;

	// ��ǰ�� ����
	int Newcount = 0;
	int NewNumcount = 0;

	// ��ǰ����� ���� ������
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
	
	//���� ��¹��.
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


	//�޴�â
	void Menu() {
		readProductNumber();
		readProduct();
		while (true) {
			System.out.println("========���� �޴�========");
			System.out.println("1. ��ǰ�Ǹ�");
			System.out.println("2. ������");
			System.out.println("3. ����");
			System.out.println("======================\n");
			System.out.println("� ������ �Ͻðڽ��ϱ�?");
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


	//��� ���� �޴�
	void CareProduct() {
		while (true) {
			System.out.println("\n========��� ����========");
			System.out.println("1. �����ȸ");
			System.out.println("2. ��ǰ�԰�");
			System.out.println("3. ��ǰ��ǰ");
			System.out.println("4. �����޴�");
			System.out.println("======================\n");
			System.out.println("� ������ �Ͻðڽ��ϱ�?  ");
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

	//��� ���
	void printProductNumber() {
		for (int i = 0; i < Newcount; i++) {
			System.out.println((i + 1) + ". " + "��ǰ��: " + proList[i].name + "\t\t����: " + pronum[i]);
		}

	}

	//��ǰ �԰�
	void plusProductNumber() {
		Print();
		System.out.println("\n�԰��Ͻ� ��ǰ ��ȣ�� �ۼ����ּ���: ");
		int kwd = scan.nextInt();
		System.out.println("�԰��Ͻ� ��ǰ ������ �ۼ����ּ���: ");
		int n = scan.nextInt();
		System.out.println("\n");
		pronum[kwd-1] += n;
		System.out.println("�԰��Ͻ� " + proList[kwd-1].name + " ��ǰ�� ������ " + pronum[kwd-1] + "���Դϴ�.");

	}

	//��ǰ ��ǰ
	void deleteProductNumber() {
		Print();
		System.out.println("\n��ǰ�Ͻ� ��ǰ ��ȣ�� �ۼ����ּ���: ");
		int kwd = scan.nextInt();
		System.out.println("��ǰ�Ͻ� ��ǰ ������ �ۼ����ּ���: "); // ��ȣ�� ó���ϱ�.
		int n = scan.nextInt();
		System.out.println("\n");
		pronum[kwd-1] -= n;
		System.out.println("��ǰ�Ͻ� " + proList[kwd-1].name + " ��ǰ�� ������ " + pronum[kwd-1] + "���Դϴ�.");

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
		System.out.println("�����Ͻ� �ѱݾ��� " + fullcount + "�� �Դϴ�.");
		NewBill = fullcount;
		while (true) {
			System.out.println("�����ݾ��� �Ա����ּ���!");
			System.out.println("�����ݾ�:");
			int Bill = scan.nextInt();
			Kbill += Bill;
			if (NewBill - Bill > 0) {
				System.out.println("�����ݾ׿��� " + (NewBill - Bill) + "���� �����մϴ�.");
				NewBill -= Bill;
			} else
				break;
		}
		System.out.println("======== �� �� �� ========");
		for (int i = 0; i < Newcount; i++)
			if (proList[i].count > 0) {
				System.out.println(proList[i].name + "\t" + proList[i].count + "��" + "\t"
						+ (proList[i].count) * (proList[i].price) + "��");
			}
		System.out.println("======================");
		System.out.println("�ѱ��űݾ� \t\t" + fullcount + "��");
		System.out.println("�����ݾ� \t\t" + Kbill + "��");
		System.out.println("�Ž�����\t\t" + (Kbill - fullcount) + "��\n\n\n");
	}

	void Print() {
		System.out.println("======== ��ǰ �޴� ========");
		for (int i = 0; i < Newcount; i++) {
			System.out.printf("%d", i + 1);
			System.out.printf(".%s\t\t%d��\n", proList[i].name, proList[i].price);
		}
	}

	void firstCount() {
		while (pronum[id] > 0) {
			System.out.println("���ǰ�� �����Ͻðڽ��ϱ�?");
			id = scan.nextInt();
			id--;
			System.out.println(proList[id].name + "�� �����ϼ̽��ϴ�.");
			if (pronum[id] <= 0) {
				System.out.println("�����Ͻ� ��ǰ�� ��� �����ϴ�. �ٽ� �������ּ���.");
				break;
			}
			System.out.println("�ܰ��� " + proList[id].price + "�� �Դϴ�.");
			System.out.println("��� �����Ͻðڽ��ϱ�?");
			Pcount = scan.nextInt();
			System.out.println("�����Ͻ� �ݾ��� " + proList[id].price * Pcount + "�� �Դϴ�.");
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
			System.out.println("�� �����Ͻðڽ��ϱ�? (��: 1/Y, �ƴϿ�: 0/N)");
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
