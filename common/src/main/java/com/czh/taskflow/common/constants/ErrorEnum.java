package com.czh.taskflow.common.constants;

/**
 * @Title: ErrorEnum.java
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company: www.chenzhehao.com
 * @author chenzhehao
 * @date 2018年6月2日
 * @version 1.0
 */
public enum ErrorEnum {

	SYS_SUCCESS("000000", "success", "success"),
	SYS_UNKNOWN("000001", "系统未知错误", "系统未知错误");

	private String errCode;
	private String errMsg;
	private String errMsgForInner;

	ErrorEnum(String errCode, String errMsg, String errMsgForInner) {
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

}
