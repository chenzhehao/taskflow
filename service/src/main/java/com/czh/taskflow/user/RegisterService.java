package com.czh.taskflow.user;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czh.taskflow.common.base.impl.WriteService;
import com.czh.taskflow.common.model.CoreContext;
import com.czh.taskflow.orm.dao.mapper.UserDAOMapper;
import com.czh.taskflow.orm.dao.mapper.UserDetailDAOMapper;

/**
 * @Title: RegisterService.java
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company: www.chenzhehao.com
 * @author chenzhehao
 * @date 2018年6月2日
 * @version 1.0
 */
@Service("registerService")
public class RegisterService extends WriteService {

	@Autowired
	UserDAOMapper userDAO;

	@Autowired
	UserDetailDAOMapper userDetail;

	@Override
	public Map submit(CoreContext context) {
//		System.out.println(userDAO.selectByPrimaryKey(Integer.getInteger(form.getId())));
		return null;
	}

}
