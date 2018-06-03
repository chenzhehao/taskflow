package com.czh.taskflow.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @Title: BaseInterceptor.java
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company: www.chenzhehao.com
 * @author chenzhehao
 * @date 2018年6月3日
 * @version 1.0
 */
public class BaseInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 用户信息获取存放
//		Cookie cookie = CookieUtils.getCookieByName(request, userAuthInCookie);
//		if (cookie != null) {
//			String loginVOJson = RedisTool.getValue(cookie.getValue());
//			if (!StringUtil.isBlank(loginVOJson)) {
//				request.setAttribute(MyBankDict.SESSION_USER,
//						ObjectUtil.jsonToObject(loginVOJson, new TypeReference<MUserInfoVo>() {
//						}));
//			}
//		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
//		Cookie cookie = CookieUtils.getCookieByName(request, userAuthInCookie);
//		if (cookie != null) {
//			MUserInfoVo userInfo = (MUserInfoVo) request.getAttribute(MyBankDict.SESSION_USER);
//			if (userInfo != null) {
//				RedisTool.setValue(cookie.getValue(), ObjectUtil.objectToJson(userInfo), userInfo.getOnlineTimeout());
//			}
//		}
	}
}
