package chap04sjw;

import javax.swing.JOptionPane;

public class WhileMenu {

	public static void main(String[] args) {
		int speed = 0;
		boolean run = true;

		String[] menus = { "증속", "감속", "종료" };
		while (run) {
			int section = 
				JOptionPane.showOptionDialog(
						null,
						"작업할메뉴를 고르세요",
						"Menu",
						JOptionPane.DEFAULT_OPTION,
					    JOptionPane.PLAIN_MESSAGE,
					    null,
					    menus,
					    menus[0]
			     );
			// System.out.println(section);
			switch (section) {
			case 0:
				speed++;
				System.out.println("현재속도:" + speed);
				break;
			case 1:
				speed--;
				System.out.println("현재속도:" + speed);
				break;
			case 2:
				run = false;
				break;
			default:

			}
		}
		System.out.println("~~~~~~~  작업종료  ~~~~~~~~~");
	}

}
