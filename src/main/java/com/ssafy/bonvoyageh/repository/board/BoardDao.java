package com.ssafy.bonvoyageh.repository.board;

import com.ssafy.bonvoyageh.model.board.BoardDto;
import com.ssafy.bonvoyageh.model.board.FileInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
public interface BoardDao {

	void writeArticle(BoardDto boardDto) throws SQLException;
	void registerFile(BoardDto boardDto) throws Exception;
	List<BoardDto> listArticle(Map<String, Object> param) throws SQLException;
	int getTotalArticleCount(Map<String, Object> param) throws SQLException;
	BoardDto getArticle(int articleNo) throws SQLException;
	void updateHit(int articleNo) throws SQLException;
	
	void modifyArticle(BoardDto boardDto) throws SQLException;
	void deleteArticle(int articleNO) throws SQLException;
//	List<BoardDto> searchArticle(Map<String, Object> param) throws SQLException;
	void deleteFile(int articleNo) throws Exception;
	List<FileInfoDto> fileInfoList(int articleNo) throws Exception;
	
}
