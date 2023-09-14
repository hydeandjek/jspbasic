package com.jsp.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;

public class DeleteService implements IBoardService {

	public DeleteService() {}
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		int bId = Integer.parseInt(request.getParameter("bid"));
		
		BoardRepository.getInstance().delete(bId);
		
		
	}

}
 