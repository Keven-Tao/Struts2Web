package com.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by KevenTao on 2017/2/23.
 */
public class TestAction extends ActionSupport{
    private static final long serialVersionUID = 1L;
    //Action属性
    private String helo;

    public String getHelo() {
        return helo;
    }

    public void setHelo(String helo) {
        this.helo = helo;
    }

    //重载excute方法
    @Override
    public String execute() throws Exception {
        helo = "hello sturts2";
        return SUCCESS;
    }
}
