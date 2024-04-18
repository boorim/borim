package kr.ac.kopo.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.vo.BoardVO;

public class BoardService {
	private BoardDAO dao;
	private int no = 0;

	public BoardService() {
		dao = new BoardDAO();
	}

	public void addBoard(BoardVO board) {
		// 게시판 번호
		board.setNo(++no);
		
		// 현재 날짜
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(new Date());
		board.setRegDate(date);
		
		dao.insert(board);
	}
	
	public List<BoardVO> SearchAllBoard() {
		List<BoardVO> list = dao.selectAll();
		return list;
	}
	
	public BoardVO searchOneBoard(int no) {
		return dao.selectOne(no);
	}
	
	public List<BoardVO> searchAllBoard() {
		List<BoardVO> list = dao.selectAll();
		return list;
	}
}
