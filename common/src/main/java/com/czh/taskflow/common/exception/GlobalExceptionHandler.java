package com.czh.taskflow.common.exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.czh.taskflow.common.constants.Dict;
import com.czh.taskflow.common.constants.ErrorEnum;

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
		if (ex instanceof BaseException) {
			BaseException e = (BaseException) ex;
			map.put(Dict.RET_CODE_KEY, e.getErrCode());
			map.put(Dict.RET_MESSAGE_KEY, e.getErrMsg());
		} else {
			map.put(Dict.RET_CODE_KEY, ErrorEnum.SYS_UNKNOWN.getErrCode());
			map.put(Dict.RET_MESSAGE_KEY, ex.getCause().getMessage());
		}
		return map;
	}
}
