package com.chaos.dao;

import com.chaos.model.ProductLog;
import java.util.List;

public interface ProductLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductLog record);

    ProductLog selectByPrimaryKey(Integer id);

    List<ProductLog> selectAll();

    int updateByPrimaryKey(ProductLog record);
}