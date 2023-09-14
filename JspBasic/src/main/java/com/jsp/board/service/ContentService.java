package com.jsp.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;
import com.jsp.board.model.BoardVO;

public class ContentService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("글 상세보기 요청이 들어옴!");
		int bid = Integer.parseInt(request.getParameter("bid"));
		BoardVO board = BoardRepository.getInstance().getContent(bid);
		request.setAttribute("content", board);
		request.setAttribute("boardNo", bid);
	}

}
