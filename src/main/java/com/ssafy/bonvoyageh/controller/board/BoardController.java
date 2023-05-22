package com.ssafy.bonvoyageh.controller.board;

import com.ssafy.bonvoyageh.model.board.BoardDto;
import com.ssafy.bonvoyageh.model.board.CommentDto;
import com.ssafy.bonvoyageh.service.board.BoardService;
import com.ssafy.bonvoyageh.util.PageNavigation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/board")
public class BoardController {

    private BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        super();
        this.boardService = boardService;
    }


    @GetMapping("/common/list")
    public List<BoardDto> commonArticlesList(@RequestParam Map<String, String> map, Model model) throws Exception {
        List<BoardDto> list = boardService.listArticle(map);
//        PageNavigation pageNavigation = boardService.makePageNavigation(map);
//        model.addAttribute("pgno", map.get("pgno"));
//        model.addAttribute("key", map.get("key"));
//        model.addAttribute("word", map.get("word"));
//        System.out.println(list);
        return list;
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
    public List<BoardDto> noticeArticlesList(@RequestParam Map<String, String> map, Model model) throws Exception {
        List<BoardDto> list = boardService.listArticle(map);
//        PageNavigation pageNavigation = boardService.makePageNavigation(map);
//        model.addAttribute("pgno", map.get("pgno"));
//        model.addAttribute("key", map.get("key"));
//        model.addAttribute("word", map.get("word"));
        return list;
    }

    @PostMapping("/notice/regist")
    public String registNoticeArticle(BoardDto boardDto){
        return "board/notice/list";
    }

    @PutMapping("/notice/modify")
    public void modifyNoticeArticle(@RequestParam Map<String, String> map) throws Exception {
//        System.out.println(map.get("articleId"));
//        System.out.println(map.get("title"));
//        System.out.println(map.get("content"));
//        BoardDto boardDto = boardService.getArticle(Integer.parseInt(map.get("articleId")));
//        System.out.println(boardDto);
//        boardDto.setTitle(map.get("title"));
//        boardDto.setContent(map.get("content"));
//        model.addAttribute("article", boardDto);
//        model.addAttribute("pgno", map.get("pgno"));
//        model.addAttribute("key", map.get("key"));
//        model.addAttribute("word", map.get("word"));
        boardService.modifyArticle(boardDto);
    }

    @DeleteMapping("/notice/{articleid}/delete")
    public String deleteNoticeArticle(@PathVariable("articleid") String articleId){
        return "board/notice/list";
    }

    @GetMapping("/notice/{articleid}/view")
    public BoardDto viewNoticeArticle(@PathVariable("articleid") int articleId) throws Exception {
        BoardDto boardDto = boardService.getArticle(articleId);
        return boardDto;
    }


}
