package com.ssafy.bonvoyageh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;


//@Controller
@Controller
//@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET})
public class AdminUserController {

	private static final Logger logger = LoggerFactory.getLogger(AdminUserController.class);

//	private MemberService memberService;

//	@Autowired
//	public AdminUserController(MemberService memberService) {
//		this.memberService = memberService;
//	}
//
//////	@ResponseBody
////	@RequestMapping(value = "/user", method = RequestMethod.GET, headers = { "Content-type=application/json" })
////	public List<MemberDto> userList() throws Exception {
////		List<MemberDto> list = memberService.listMember(null);
////		logger.debug("회원목록 : {}", list);
////		return list;
//////        return memberService.listMember();
////	}
////
//////	@ResponseBody
////	@RequestMapping(value = "/user", method = RequestMethod.POST, headers = { "Content-type=application/json" })
////	public List<MemberDto> userRegister(@RequestBody MemberDto memberDto) throws Exception {
////		memberService.joinMember(memberDto);
////		return memberService.listMember(null);
////	}
////
//////	@ResponseBody
////	@RequestMapping(value = "/user/{userid}", method = RequestMethod.GET, headers = { "Content-type=application/json" })
////	public MemberDto userInfo(@PathVariable("userid") String userid) throws Exception {
////		return memberService.getMember(userid);
////	}
////
//////	@ResponseBody
////	@RequestMapping(value = "/user", method = RequestMethod.PUT, headers = { "Content-type=application/json" })
////	public List<MemberDto> userModify(@RequestBody MemberDto memberDto) throws Exception {
////		memberService.updateMember(memberDto);
////		return memberService.listMember(null);
////	}
////
//////	@ResponseBody
////	@RequestMapping(value = "/user/{userid}", method = RequestMethod.DELETE, headers = {
////			"Content-type=application/json" })
////	public List<MemberDto> userDelete(@PathVariable("userid") String userid) throws Exception {
////		memberService.deleteMember(userid);
////		return memberService.listMember(null);
////	}
//
//	@GetMapping(value = "/user")
//	public ResponseEntity<?> userList() {
//		logger.debug("userList call");
//		try {
//			List<MemberDto> list = memberService.listMember(null);
//			if(list != null && !list.isEmpty()) {
//				return new ResponseEntity<List<MemberDto>>(list, HttpStatus.OK);
////				return new ResponseEntity<List<MemberDto>>(HttpStatus.NOT_FOUND);
//			} else {
//				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//			}
//		} catch (Exception e) {
//			return exceptionHandling(e);
//		}
//
//	}
//
//	@PostMapping(value = "/user")
//	public ResponseEntity<?> userRegister(@RequestBody MemberDto memberDto) {
//		logger.debug("userRegister memberDto : {}", memberDto);
//		try {
//			memberService.joinMember(memberDto);
//			List<MemberDto> list = memberService.listMember(null);
//			return new ResponseEntity<List<MemberDto>>(list, HttpStatus.OK);
////			return new ResponseEntity<Integer>(cnt, HttpStatus.CREATED);
//		} catch (Exception e) {
//			return exceptionHandling(e);
//		}
//
//	}
//
//	@GetMapping(value = "/user/{userid}")
//	public ResponseEntity<?> userInfo(@PathVariable("userid") String userId) {
//		logger.debug("userInfo userid : {}", userId);
//		try {
//			MemberDto memberDto = memberService.getMember(userId);
//			if(memberDto != null)
//				return new ResponseEntity<MemberDto>(memberDto, HttpStatus.OK);
//			else
//				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//		} catch (Exception e) {
//			return exceptionHandling(e);
//		}
//	}
//
//	@PutMapping(value = "/user")
//	public ResponseEntity<?> userModify(@RequestBody MemberDto memberDto) {
//		logger.debug("userModify memberDto : {}", memberDto);
//		try {
//			memberService.updateMember(memberDto);
//			List<MemberDto> list = memberService.listMember(null);
//			return new ResponseEntity<List<MemberDto>>(list, HttpStatus.OK);
//		} catch (Exception e) {
//			return exceptionHandling(e);
//		}
//	}
//
//	@DeleteMapping(value = "/user/{userid}")
//	public ResponseEntity<?> userDelete(@PathVariable("userid") String userId) {
//		logger.debug("userDelete userid : {}", userId);
//		try {
//			memberService.deleteMember(userId);
//			List<MemberDto> list = memberService.listMember(null);
//			return new ResponseEntity<List<MemberDto>>(list, HttpStatus.OK);
//		} catch (Exception e) {
//			return exceptionHandling(e);
//		}
//	}

	private ResponseEntity<String> exceptionHandling(Exception e) {
		e.printStackTrace();
		return new ResponseEntity<String>("Error : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
