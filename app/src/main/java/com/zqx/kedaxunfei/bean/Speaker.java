package com.zqx.kedaxunfei.bean;

import com.zqx.kedaxunfei.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Zhang Qixiang on 2017/12/1.
 */

public enum Speaker {

    xiaoyan(R.mipmap.xiaoyan, "小燕 青年女声", "xiaoyan"),
    laosun(R.mipmap.laosun, "老孙 中年男声", "vils"),
    tanglaoya(R.mipmap.tanglaoya, "唐老鸭 卡通人物", "aisduck"),
    xiaoxin(R.mipmap.xiaoxin, "小新 卡通人物", "xiaoxin"),
    xiaowanzi(R.mipmap.xiaowanzi, "小丸子 卡通人物", "xiaowanzi"),
    xiaomei(R.mipmap.xiaomei, "粤语 小梅 青年女声", "xiaomei"),
    dengziqi(R.mipmap.dengziqi, "台普 小玲 青年女声", "aisxlin"),
    xiaoqian(R.mipmap.xiaoqian, "东北 小倩 青年女声", "xiaoqian"),
    xiaorong(R.mipmap.xiaorong, "四川 小蓉 青年女声", "aisxrong"),
    xiaokun(R.mipmap.xiaokun, "河南 小坤 青年男声", "xiaokun"),
    xiaoqiang(R.mipmap.xiaoqiang, "湖南 小强 青年男声", "aisxqiang"),
    henry(R.mipmap.henry, "美式英语 亨利 青年男声", "henry");


    public int iconId;
    public String desc;
    public String voice;

    Speaker(int iconId, String desc, String stringParam) {
        this.iconId = iconId;
        this.desc = desc;
        this.voice = stringParam;
    }

    public static List<Speaker> getAllSpeakers() {
        return new ArrayList<>(
                Arrays.asList(
                        xiaoyan,
                        laosun,
                        tanglaoya,
                        xiaoxin,
                        xiaowanzi,
                        xiaomei,
                        dengziqi,
                        xiaoqian,
                        xiaorong,
                        xiaokun,
                        xiaoqiang,
                        henry
                )
        );
    }

}
