package com.chaos.dao;

import com.chaos.model.TopicGoods;
import java.util.List;

public interface TopicGoodsMapper {
    int deleteByPrimaryKey(Long topicGoodsId);

    int insert(TopicGoods record);

    TopicGoods selectByPrimaryKey(Long topicGoodsId);

    List<TopicGoods> selectAll();

    int updateByPrimaryKey(TopicGoods record);
}