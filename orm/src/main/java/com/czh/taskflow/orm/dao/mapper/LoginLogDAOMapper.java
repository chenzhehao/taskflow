package com.czh.taskflow.orm.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.czh.taskflow.orm.dao.LoginLogDAO;

@Mapper
public interface LoginLogDAOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoginLogDAO record);

    int insertSelective(LoginLogDAO record);

    LoginLogDAO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoginLogDAO record);

    int updateByPrimaryKey(LoginLogDAO record);
}