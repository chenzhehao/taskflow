package com.czh.taskflow.user;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czh.task.vo.user.LoginForm;
import com.czh.taskflow.common.base.impl.WriteService;
import com.czh.taskflow.common.model.CoreContext;
import com.czh.taskflow.orm.dao.mapper.UserDAOMapper;
import com.czh.taskflow.orm.dao.mapper.UserDetailDAOMapper;

/**
 * @Title: UserService.java
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company: www.chenzhehao.com
 * @author chenzhehao
 * @date 2018年6月2日
 * @version 1.0
 */
@Service("userService")
public class UserService extends WriteService {

	@Autowired
	UserDAOMapper userDAO;

	@Autowired
	UserDetailDAOMapper userDetail;

	@Override
	public Map submit(CoreContext context) {
		LoginForm form = (LoginForm) context.getForm();
		System.out.println(form.getId());
		System.out.println(userDAO.selectByPrimaryKey(Integer.valueOf(form.getId())));
		return null;
	}
}
