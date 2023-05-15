package com.ssafy.bonvoyageh.model.board;

import lombok.Data;

import java.util.List;

@Data
public class BoardDto {

	private int articleNo;
	private String userId;
	private String title;
	private String content;
	private int hit;
	private String createtime;
	private List<FileInfoDto> fileInfos;
	@Override
	public String toString() {
		return "BoardDto [articleNo=" + articleNo + ", userId=" + userId + ", subject=" + title + ", content="
				+ content + ", hit=" + hit + ", registerTime=" + createtime + "]";
	}

}
