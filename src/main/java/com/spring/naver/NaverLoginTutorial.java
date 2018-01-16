package com.spring.naver;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.scribejava.core.model.OAuth2AccessToken;
import com.spring.common.web.controller.BaseController;

@Controller("loginController")
@RequestMapping(value = "/user", method = { RequestMethod.POST, RequestMethod.GET })
public class NaverLoginTutorial extends BaseController {
	
	
	@Autowired
	private NaverLoginBo naverLoginBo;
	
	
	@RequestMapping("login")
	public ModelAndView login(HttpSession session, HttpServletRequest request, HashMap<String,Object> param) {
		String naverAuthUrl = naverLoginBo.getAuthorizationUrl(session);
		//String redirectUrl = new URL(request.getRequestURL().toString()).toString().replaceAll("login", "oauth2callback");
		param.put("url", naverAuthUrl);
		return new ModelAndView("user/login", "param", param);
	}
	
	@RequestMapping("callback")
	public ModelAndView callback(HashMap<String,Object> param,@RequestParam String code, @RequestParam String state, HttpSession session) throws IOException {
		/* 네아로 인증이 성공적으로 완료되면 code 파라미터가 전달되며 이를 통해 access token을 발급 */
		OAuth2AccessToken oauthToken = naverLoginBo.getAccessToken(session, code, state);
		String apiResult = naverLoginBo.getUserProfile(oauthToken);
		param.put("result", apiResult);
    	return new ModelAndView("user/callback", "param", param);
	}
}
