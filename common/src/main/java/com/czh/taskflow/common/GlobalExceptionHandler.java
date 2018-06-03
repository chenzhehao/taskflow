package com.czh.taskflow.common;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.czh.taskflow.common.constants.Dict;

/**
 * @Title: GlobalExceptionHandler.java
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company: www.chenzhehao.com
 * @author chenzhehao
 * @date 2018年6月2日
 * @version 1.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public Object myBankException(final HttpServletRequest request, final HttpServletResponse response,
			final Exception ex) {
		ex.printStackTrace();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(Dict.RET_CODE_KEY, Dict.SUCCESS_CODE);
		map.put(Dict.RET_MESSAGE_KEY, ex.getMessage());
		return map;
	}
}
