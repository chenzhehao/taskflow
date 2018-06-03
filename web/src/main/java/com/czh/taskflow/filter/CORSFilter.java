package com.czh.taskflow.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * @Title: CORSFilter.java
 * @Description:前后端分离跨域请求问题处理
 * @Copyright: Copyright (c) 2018
 * @Company: www.chenzhehao.com
 * @author chenzhehao
 * @date 2018年6月3日
 * @version 1.0
 */
@Component
public class CORSFilter extends OncePerRequestFilter implements Ordered {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "GET, POST");
		response.addHeader("Access-Control-Allow-Headers", "Content-Type");
		// response.addHeader("Access-Control-Max-Age", "1800");// 30 min
		filterChain.doFilter(request, response);
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
}
