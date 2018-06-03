package com.czh.taskflow.common.model;

import java.io.Serializable;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * @Title: CoreContext.java
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company: www.chenzhehao.com
 * @author chenzhehao
 * @date 2018年6月2日
 * @version 1.0
 */
public class CoreContext implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3717645117678688361L;
	/**
	 * 请求request
	 */
	private HttpServletRequest httpServletRequest;
	/**
	 * 全局流水号
	 */
	private String globalSerial;
	/**
	 * 请求参数对象
	 */
	private IRequestForm form;
	/**
	 * 用户信息
	 */
	private UserVo user;
	/**
	 * 业务调用方法返回信息
	 */
	private Map result;

	public HttpServletRequest getHttpServletRequest() {
		return httpServletRequest;
	}

	public void setHttpServletRequest(HttpServletRequest httpServletRequest) {
		this.httpServletRequest = httpServletRequest;
	}

	public String getGlobalSerial() {
		return globalSerial;
	}

	public void setGlobalSerial(String globalSerial) {
		this.globalSerial = globalSerial;
	}

	public IRequestForm getForm() {
		return form;
	}

	public void setForm(IRequestForm form) {
		this.form = form;
	}

	public UserVo getUser() {
		return user;
	}

	public void setUser(UserVo user) {
		this.user = user;
	}

	public Map getResult() {
		return result;
	}

	public void setResult(Map result) {
		this.result = result;
	}

}
