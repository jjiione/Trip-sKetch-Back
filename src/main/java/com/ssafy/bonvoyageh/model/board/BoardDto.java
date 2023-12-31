package com.ssafy.bonvoyageh.model.board;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
public class BoardDto {

	private int articleId;
	private String userId;
	private String title;
	private String content;
	private int hit;
	private String createtime;
	private String boardType;
	private List<FileInfoDto> fileInfos;
	private String img;

	@Override
	public String toString() {
		return "BoardDto{" +
				"articleId=" + articleId +
				", userId='" + userId + '\'' +
				", title='" + title + '\'' +
				", content='" + content + '\'' +
				", hit=" + hit +
				", createtime=" + createtime +
				", boardType='" + boardType + '\'' +
				", fileInfos=" + fileInfos +
				", img='" + img + '\'' +
				'}';
	}
}
