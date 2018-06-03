package com.czh.taskflow.orm.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.czh.taskflow.orm.dao.UserDetailDAO;

@Mapper
public interface UserDetailDAOMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(UserDetailDAO record);

	int insertSelective(UserDetailDAO record);

	UserDetailDAO selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(UserDetailDAO record);

	int updateByPrimaryKey(UserDetailDAO record);
}