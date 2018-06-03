package com.czh.task.vo.user;

import org.hibernate.validator.constraints.NotBlank;

import com.czh.taskflow.common.model.IRequestForm;

/**
 * 登录form
 * 
 * @author chenzhehao
 *
 */
public class LoginForm implements IRequestForm {

	@NotBlank(message = "登录用户不能为空")
	private String id;
	@NotBlank(message = "交易密码不能为空")
	private String passwd;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}
