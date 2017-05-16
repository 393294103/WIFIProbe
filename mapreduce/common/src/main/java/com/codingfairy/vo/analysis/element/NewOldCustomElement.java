package com.codingfairy.vo.analysis.element;

import lombok.Data;

/**
 * Created by darxan on 2017/5/14.
 * 新老顾客：一定时间段内首次/两次以上进⼊店铺的顾客
 * 纵坐标：时间
 * 横坐标：新/老顾客数目
 */
@Data
public class NewOldCustomElement {
    protected String wifiProb;
    private Long hour;
    private int newCustomer;
    private int oldCustomer;
}
