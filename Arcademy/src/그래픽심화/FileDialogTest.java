package 그래픽심화;

import java.awt.*;
import java.awt.event.*;      //파일을 가져오는게 이벤트이기때문에 이벤트를 넣었다.

public class FileDialogTest {    //파일찾아주기.
	public static void main(String[] args) {
		Frame f = new Frame("parent");
		f.setSize(300,200);
		FileDialog fileOpen = new FileDialog(f,"파일열기",FileDialog.LOAD); //소속 프레임, 타이틀.
		f.setVisible(true);
		fileOpen.setDirectory("jdk1.8.0_202");   //파일이 위치한 장소(c디스크에 있는 내용 정확히 명시)
		fileOpen.setVisible(true);
		System.out.println(fileOpen.getDirectory()+fileOpen.getFile());   //장소를 출력. 파일이름 출력.
	}
}
