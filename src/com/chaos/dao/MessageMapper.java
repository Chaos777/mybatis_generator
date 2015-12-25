package com.chaos.dao;

import com.chaos.model.Message;
import java.util.List;

public interface MessageMapper {
    int deleteByPrimaryKey(Long messageId);

    int insert(Message record);

    Message selectByPrimaryKey(Long messageId);

    List<Message> selectAll();

    int updateByPrimaryKey(Message record);
}