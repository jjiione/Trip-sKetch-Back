package com.ssafy.bonvoyageh.service.board;

import com.ssafy.bonvoyageh.model.board.BoardDto;
import com.ssafy.bonvoyageh.util.PageNavigation;

import java.util.List;
import java.util.Map;


public interface BoardService {

	void writeArticle(BoardDto boardDto) throws Exception;
	List<BoardDto> listArticle(Map<String, String> map) throws Exception;
	PageNavigation makePageNavigation(Map<String, String> map) throws Exception;
	BoardDto getArticle(int articleNo) throws Exception;
	void updateHit(int articleNo) throws Exception;
	
	void modifyArticle(BoardDto boardDto) throws Exception;
	void deleteArticle(int articleNo, String path) throws Exception;
	
}
