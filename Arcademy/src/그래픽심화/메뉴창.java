package �׷��Ƚ�ȭ;

import java.awt.*;

public class �޴�â {
	public static void main(String[] args) {  //���� �޴�â �����
		Frame f = new Frame("Frame with Menu");
		f.setSize(300,200);
		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("File");         //�޴���� ȣ���� ��� ���� �ٽ��̶� �Ҽ��վ�.
		
		MenuItem miNew = new MenuItem("New");        //File�� �Ҽӵ� �κе�.
		MenuItem miOpen = new MenuItem("Open");
		Menu mOthers = new Menu("Others");              //��� �޴���!!
		MenuItem miExit = new MenuItem("Exit");
		
		mFile.add(miNew);        //�� �޴��� �޴� �����۵��� �߰�.
		mFile.add(miOpen);
		mFile.add(mOthers);
		mFile.addSeparator();    //�޴� �и���
		mFile.add(miExit);
		
		MenuItem miPrint = new MenuItem("Print...");
		MenuItem miPreview = new MenuItem("Print Preview");    //�ܰ躰�� �޴��� �� ���������.
		MenuItem miSetup = new MenuItem("Print Setup...");
		mOthers.add(miPrint);
		mOthers.add(miPreview);
		mOthers.add(miSetup);
		
		Menu mEdit = new Menu("Edit");
		Menu mView = new Menu("View");
		Menu mHelp = new Menu("Help");
	    CheckboxMenuItem miStatusbar = new CheckboxMenuItem("Statusbar");
	    mView.add(miStatusbar);
	    mb.add(mFile);             //MenuBar�� Menu�� �߰��Ѵ�.
	    mb.add(mEdit);
	    mb.add(mView);
	    mb.setHelpMenu(mHelp);     //mHelp�� HelpMenu�� �����Ѵ�.
	    
	    f.setMenuBar(mb);          //�����ӿ� �޴��ٸ� ����.
	    f.setVisible(true);
	}

}
