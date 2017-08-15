package com.zqx.kedaxunfei.bean;

/**
 * Created by ZhangQixiang on 2017/1/6.
 */
public class SpeakerBean {
    public int    iconId;
    public String desc;
    public String voice;

    public SpeakerBean(int iconId, String desc, String stringParam) {
        this.iconId = iconId;
        this.desc = desc;
        this.voice = stringParam;
    }
}
