package com.chaos.dao;

import com.chaos.model.Producttype;
import java.util.List;

public interface ProducttypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Producttype record);

    Producttype selectByPrimaryKey(Integer id);

    List<Producttype> selectAll();

    int updateByPrimaryKey(Producttype record);
}