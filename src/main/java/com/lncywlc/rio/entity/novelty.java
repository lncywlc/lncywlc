package com.lncywlc.rio.entity;

import java.util.Date;

/**
 * @author wuliangchao
 * @create 2018-12-10 10:53
 */
public class novelty {
    //主键ID,自增
    private Integer appId;
    //用户ID
    private String userId;
    //图片编号
    private  String imageId;
    //发表内容
    private String content;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    //发布时间
    private Date createTime;
}
