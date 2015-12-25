package com.chaos.dao;

import com.chaos.model.Topic;
import java.util.List;

public interface TopicMapper {
    int deleteByPrimaryKey(Long topicId);

    int insert(Topic record);

    Topic selectByPrimaryKey(Long topicId);

    List<Topic> selectAll();

    int updateByPrimaryKey(Topic record);
}