package com.lujj.Adapter;

import com.lujj.Adapter.bean.IUserInfo;
import com.lujj.Adapter.bean.OutherUserInfo;

/**
 * 适配器模式
 */
public class Client {
    public static void main(String[] args) {
        IUserInfo youngGirl = new OutherUserInfo();
        for(int i=0;i<101;i++){
            youngGirl.getHomeAddress();
        }
    }
}
