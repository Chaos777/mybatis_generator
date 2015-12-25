package com.chaos.model;

import java.util.Date;

public class Message {
    private Long messageId;

    private String title;

    private String content;

    private Boolean status;

    private String owner;

    private Boolean scope;

    private Boolean type;

    private String activeLink;

    private Date addTime;

    private Date sendTime;

    private Date modifyTime;

    private Long messageRid;

    private String contentDetail;

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public Boolean getScope() {
        return scope;
    }

    public void setScope(Boolean scope) {
        this.scope = scope;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getActiveLink() {
        return activeLink;
    }

    public void setActiveLink(String activeLink) {
        this.activeLink = activeLink == null ? null : activeLink.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getMessageRid() {
        return messageRid;
    }

    public void setMessageRid(Long messageRid) {
        this.messageRid = messageRid;
    }

    public String getContentDetail() {
        return contentDetail;
    }

    public void setContentDetail(String contentDetail) {
        this.contentDetail = contentDetail == null ? null : contentDetail.trim();
    }
}