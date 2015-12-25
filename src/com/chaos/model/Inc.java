package com.chaos.model;

public class Inc {
    private Integer mid;

    private String te;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getTe() {
        return te;
    }

    public void setTe(String te) {
        this.te = te == null ? null : te.trim();
    }
}