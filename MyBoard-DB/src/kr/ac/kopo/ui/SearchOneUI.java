package kr.ac.kopo.ui;

import kr.ac.kopo.vo.BoardVO;

public class SearchOneUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		int no = scanInt("��ȸ�� �۹�ȣ�� �Է��ϼ��� : ");
		
		BoardVO board = new BoardVO();
		board.setNo(no);
		
		System.out.println("----------------------------");
		System.out.println("�Խ��� ��ȣ : " + board.getNo());
		System.out.println("�� �� �� ¥ : " + board.getRegDate());
		System.out.println("��       �� : " + board.getTitle());
		System.out.println("��   ��  �� : " + board.getWriter());
		System.out.println("----------------------------");
		
		
	}

}

