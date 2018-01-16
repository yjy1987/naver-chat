package com.spring.naver;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth20Service;

public class NaverLoginBo {

	@Value("#{props['naver.client.id']}" )
	private  String CLIENT_ID;
	
	@Value("#{props['naver.client.secret']}" )
	private  String CLIENT_SECRET;
	
	@Value("#{props['naver.redirect.uri']}" )
	private  String REDIRECT_URI;
	
	/*private final static String REDIRECT_URI_REAL = "ec2-13-125-145-68.ap-northeast-2.compute.amazonaws.com/naver-chat/user/callback";*/
	@Value("#{props['naver.session.state']}" )
	private  String SESSION_STATE; 
	
	/* ������ ��ȸ API URL */
	@Value("#{props['naver.profile.api.url']}" )
	private  String PROFILE_API_URL;
	
	/* �׾Ʒ� ����  URL ����  Method */
	public String getAuthorizationUrl(HttpSession session) {
		
		
		/*String abc = CommonUtils.getProperty("abc");
		System.out.print(abc);*/
		
		/* ���� ��ȿ�� ������ ���Ͽ� ������ ���� */
		String state = generateRandomString();
		/* ������ ���� ���� session�� ���� */
		setSession(session,state);

		/* Scribe���� �����ϴ� ���� URL ���� ����� �̿��Ͽ� �׾Ʒ� ���� URL ���� */
		OAuth20Service oauthService = new ServiceBuilder()
				.apiKey(CLIENT_ID)
				.apiSecret(CLIENT_SECRET)
				.callback(REDIRECT_URI)
				.state(state) //�ռ� ������ �������� ���� URL������ �����
				.build(NaverLoginApi.instance());
		System.out.println("������� ������ �ʾ�? : "+ oauthService.getAuthorizationUrl());
		return oauthService.getAuthorizationUrl();
	}

	/* �׾Ʒ� Callback ó�� ��  AccessToken ȹ�� Method */
	public OAuth2AccessToken getAccessToken(HttpSession session, String code, String state) throws IOException{
		
		/* Callback���� ���޹��� ���������� �������� ���ǿ� ����Ǿ��ִ� ���� ��ġ�ϴ��� Ȯ�� */
		String sessionState = getSession(session);
		if(StringUtils.equals(sessionState, state)){
		
			OAuth20Service oauthService = new ServiceBuilder()
					.apiKey(CLIENT_ID)
					.apiSecret(CLIENT_SECRET)
					.callback(REDIRECT_URI)
					.state(state)					
					.build(NaverLoginApi.instance());
					
			/* Scribe���� �����ϴ� AccessToken ȹ�� ������� �׾Ʒ� Access Token�� ȹ�� */
			OAuth2AccessToken accessToken = oauthService.getAccessToken(code);
			return accessToken;
		}
		return null;
	}
	
	/* ���� ��ȿ�� ������ ���� ���� ������ */
	private String generateRandomString() {
		return UUID.randomUUID().toString();
	}
	
	/* http session�� ������ ���� */
	private void setSession(HttpSession session,String state){
		session.setAttribute(SESSION_STATE, state);		
	}

	/* http session���� ������ �������� */	
	private String getSession(HttpSession session){
		return (String) session.getAttribute(SESSION_STATE);
	}
	
	/* Access Token�� �̿��Ͽ� ���̹� ����� ������ API�� ȣ�� */
	public String getUserProfile(OAuth2AccessToken oauthToken) throws IOException{

		OAuth20Service oauthService =new ServiceBuilder()
    			.apiKey(CLIENT_ID)
    			.apiSecret(CLIENT_SECRET)
    			.callback(REDIRECT_URI).build(NaverLoginApi.instance());
    	
    		OAuthRequest request = new OAuthRequest(Verb.GET, PROFILE_API_URL, oauthService);
		oauthService.signRequest(oauthToken, request);
		Response response = request.send();
		return response.getBody();
	}
	

}
