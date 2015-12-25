package com.chaos.dao;

import com.chaos.model.Inc;
import java.util.List;

public interface IncMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Inc record);

    Inc selectByPrimaryKey(Integer mid);

    List<Inc> selectAll();

    int updateByPrimaryKey(Inc record);
}