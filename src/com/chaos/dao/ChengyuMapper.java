package com.chaos.dao;

import com.chaos.model.Chengyu;
import java.util.List;

public interface ChengyuMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Chengyu record);

    Chengyu selectByPrimaryKey(Short id);

    List<Chengyu> selectAll();

    int updateByPrimaryKey(Chengyu record);
}