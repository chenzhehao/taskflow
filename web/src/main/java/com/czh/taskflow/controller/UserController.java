package com.czh.taskflow.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.czh.task.vo.user.LoginForm;
import com.czh.taskflow.common.base.impl.WriteService;

/**
 * @Title: UserController.java
 * @Description:用户controller，包含注册、登录、登出、所有与用户相关的查询、修改、增加等
 * @Copyright: Copyright (c) 2018
 * @Company: www.chenzhehao.com
 * @author chenzhehao
 * @date 2018年6月2日
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	WriteService userService;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public Object register(final HttpServletRequest request, final HttpServletResponse response,
			@Valid final LoginForm form, final BindingResult bindingResult) {
		userService.handler(request, form);
		return "success";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public Object login() {
		return "success";
	}
}
