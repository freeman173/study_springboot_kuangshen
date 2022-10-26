package com.jc.prototype.demo01;

/*
1、实现一个接口
2、重写一个方法
 */

import java.util.Date;

public class Video implements Cloneable{

    private String name;
    private Date createTime;


//    重写克隆方法实现深克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj=super.clone();

        Video v=(Video) obj;
        v.createTime= (Date) this.createTime.clone();

        return obj;
    }


//    有参与无参构造
    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }
    public Video() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
