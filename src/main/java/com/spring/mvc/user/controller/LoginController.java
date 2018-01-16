package com.spring.mvc.user.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.common.web.controller.BaseController;
import com.spring.mvc.user.service.LoginService;
import com.spring.naver.NaverLoginBo;

public class LoginController extends BaseController {
	
	@Autowired
	private NaverLoginBo naverLoginBo;
	
	@Autowired
	private LoginService loginService;
	
	/*@RequestMapping("login")
	public ModelAndView login(HttpSession session, HashMap<String,Object> param) {
		String naverAuthUrl = naverLoginBo.getAuthorizationUrl(session);
		param.put("url", naverAuthUrl);
		return new ModelAndView("user/login", "param", param);
	}
	
	@RequestMapping("callback")
	public ModelAndView callback(HashMap<String,Object> param,@RequestParam String code, @RequestParam String state, HttpSession session) throws IOException {
		 네아로 인증이 성공적으로 완료되면 code 파라미터가 전달되며 이를 통해 access token을 발급 
		OAuth2AccessToken oauthToken = naverLoginBo.getAccessToken(session, code, state);
		String apiResult = naverLoginBo.getUserProfile(oauthToken);
		param.put("result", apiResult);
    	return new ModelAndView("callback", "param", param);
	}*/
}
