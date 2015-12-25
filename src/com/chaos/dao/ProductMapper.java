package com.chaos.dao;

import com.chaos.model.Product;
import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer proid);

    int insert(Product record);

    Product selectByPrimaryKey(Integer proid);

    List<Product> selectAll();

    int updateByPrimaryKey(Product record);
}