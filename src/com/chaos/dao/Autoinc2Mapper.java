package com.chaos.dao;

import com.chaos.model.Autoinc2;
import java.util.List;

public interface Autoinc2Mapper {
    int deleteByPrimaryKey(Integer col);

    int insert(Autoinc2 record);

    List<Autoinc2> selectAll();
}