package com.ssafy.bonvoyageh.controller.board;

import com.ssafy.bonvoyageh.model.board.BoardDto;
import com.ssafy.bonvoyageh.model.board.CommentDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardContoller {
    @GetMapping(value = {"/", "/index"})
    public String index(){
        return "index";
    }

    @GetMapping("/common/list")
    public String commonArticlesList(List<BoardDto> boardDtoList){
        return "board/common/list";
    }

    @PostMapping("/common/regist")
    public String registCommonArticle(BoardDto boardDto){
        return "board/common/list";
    }

    @PutMapping("/common/modify")
    public String modifyCommonArticle(BoardDto boardDto){
        return "board/common/list";
    }

    @DeleteMapping("/common/{articleid}/delete")
    public String deleteCommonArticle(@PathVariable("articleid") String articleId){
        return "board/common/list";
    }

    @GetMapping("/common/{articleid}/view")
    public String viewCommonArticle(@PathVariable("articleid") String articleId){
        return "board/common/view";
    }

    @PostMapping("/comment/{articleid}/regist")
    public String registComment(@PathVariable("articleid") String articleId, CommentDto commentDto){
        return "board/common/list";
    }

    @DeleteMapping("/comment/{articleid}/{commentid}/delete")
    public String deleteComment(@PathVariable("articleid") String articleId, @PathVariable("commentid") String commentId){
        return "board/common/list";
    }

    @GetMapping("/comment/view")
    public String commentList(List<CommentDto> commentDtoList){
        return "board/common/view";
    }

    @GetMapping("/notice/list")
    public String noticeArticlesList(List<BoardDto> boardDtoList){
        return "board/notice/list";
    }

    @PostMapping("/notice/regist")
    public String registNoticeArticle(BoardDto boardDto){
        return "board/notice/list";
    }

    @PutMapping("/notice/modify")
    public String modifyNoticeArticle(BoardDto boardDto){
        return "board/notice/list";
    }

    @DeleteMapping("/notice/{articleid}/delete")
    public String deleteNoticeArticle(@PathVariable("articleid") String articleId){
        return "board/notice/list";
    }

    @GetMapping("/notice/{articleid}/view")
    public String viewNoticeArticle(@PathVariable("articleid") String articleId){
        return "board/notice/view";
    }


}
