package com.czh.taskflow.common.exception;

import com.czh.taskflow.common.constants.ErrorEnum;

/**
 * @Title: BaseException.java
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company: www.chenzhehao.com
 * @author chenzhehao
 * @date 2018年6月2日
 * @version 1.0
 */
public class BaseException extends RuntimeException {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2013278684263803685L;
	/**
	 * 错误编码
	 */
	private String errCode;
	/**
	 * 错误信息，用户可见
	 */
	private String errMsg;
	/**
	 * 错误信息，开发人员可见
	 */
	private String errMsgForInner;

	public BaseException(String errCode, String errMsg) {
		this(errCode, errMsg, errMsg);
	}
	
	public BaseException(ErrorEnum error){
		this(error.getErrCode(), error.getErrMsg(), error.getErrMsgForInner());
	}

	public BaseException(String errCode, String errMsg, String errMsgForInner) {
		this.errCode = errCode;
		this.errMsg = errMsg;
		this.errMsgForInner = errMsgForInner;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getErrMsgForInner() {
		return errMsgForInner;
	}

	public void setErrMsgForInner(String errMsgForInner) {
		this.errMsgForInner = errMsgForInner;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
