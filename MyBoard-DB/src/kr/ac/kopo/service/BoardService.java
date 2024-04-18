package kr.ac.kopo.service;

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
