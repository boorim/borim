package kr.ac.kopo.ui;

import kr.ac.kopo.vo.BoardVO;

public class UpdateUI extends BaseUI {

	@Override
	public void execute() throws Exception {
	
		BoardVO board = new BoardVO();
		
		System.out.println("<<< �Խ��� ���� ���� >>>");
		int no = scanInt("������ �۹�ȣ�� �Է��ϼ��� : ");
		String title = scanStr("������ ������ �Է��ϼ��� : ");
		String writer = scanStr("������ �ۼ��ڸ� �Է��ϼ��� : ");

		//
		
		System.out.println("[" + no + "]�� �Խñ��� �����Ͽ����ϴ�.");
	}
}
