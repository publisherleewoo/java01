package com.board.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.board.model.User;


@Mapper
public interface UserMapper	{
    public User getUser(int num);
}
