package 그래픽심화;

import java.awt.*;

public class 메뉴창 {
	public static void main(String[] args) {  //위에 메뉴창 만들기
		Frame f = new Frame("Frame with Menu");
		f.setSize(300,200);
		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("File");         //메뉴라는 호출이 어떻게 보면 핵심이라 할수잇어.
		
		MenuItem miNew = new MenuItem("New");        //File에 소속될 부분들.
		MenuItem miOpen = new MenuItem("Open");
		Menu mOthers = new Menu("Others");              //얘는 메뉴야!!
		MenuItem miExit = new MenuItem("Exit");
		
		mFile.add(miNew);        //각 메뉴에 메뉴 아이템들을 추가.
		mFile.add(miOpen);
		mFile.add(mOthers);
		mFile.addSeparator();    //메뉴 분리선
		mFile.add(miExit);
		
		MenuItem miPrint = new MenuItem("Print...");
		MenuItem miPreview = new MenuItem("Print Preview");    //단계별로 메뉴를 잘 맞춰줘야함.
		MenuItem miSetup = new MenuItem("Print Setup...");
		mOthers.add(miPrint);
		mOthers.add(miPreview);
		mOthers.add(miSetup);
		
		Menu mEdit = new Menu("Edit");
		Menu mView = new Menu("View");
		Menu mHelp = new Menu("Help");
	    CheckboxMenuItem miStatusbar = new CheckboxMenuItem("Statusbar");
	    mView.add(miStatusbar);
	    mb.add(mFile);             //MenuBar에 Menu를 추가한다.
	    mb.add(mEdit);
	    mb.add(mView);
	    mb.setHelpMenu(mHelp);     //mHelp를 HelpMenu로 지정한다.
	    
	    f.setMenuBar(mb);          //프레임에 메뉴바를 포함.
	    f.setVisible(true);
	}

}
