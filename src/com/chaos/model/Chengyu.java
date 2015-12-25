package com.chaos.model;

public class Chengyu {
    private Short id;

    private String chengyu;

    private String pingyin;

    private String diangu;

    private String lizi;

    private String spingyin;

    private String chuchu;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getChengyu() {
        return chengyu;
    }

    public void setChengyu(String chengyu) {
        this.chengyu = chengyu == null ? null : chengyu.trim();
    }

    public String getPingyin() {
        return pingyin;
    }

    public void setPingyin(String pingyin) {
        this.pingyin = pingyin == null ? null : pingyin.trim();
    }

    public String getDiangu() {
        return diangu;
    }

    public void setDiangu(String diangu) {
        this.diangu = diangu == null ? null : diangu.trim();
    }

    public String getLizi() {
        return lizi;
    }

    public void setLizi(String lizi) {
        this.lizi = lizi == null ? null : lizi.trim();
    }

    public String getSpingyin() {
        return spingyin;
    }

    public void setSpingyin(String spingyin) {
        this.spingyin = spingyin == null ? null : spingyin.trim();
    }

    public String getChuchu() {
        return chuchu;
    }

    public void setChuchu(String chuchu) {
        this.chuchu = chuchu == null ? null : chuchu.trim();
    }
}