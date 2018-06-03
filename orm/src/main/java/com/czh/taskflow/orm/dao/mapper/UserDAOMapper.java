package com.czh.taskflow.orm.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.czh.taskflow.orm.dao.UserDAO;

@Mapper
public interface UserDAOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserDAO record);

    int insertSelective(UserDAO record);

    UserDAO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDAO record);

    int updateByPrimaryKey(UserDAO record);
}