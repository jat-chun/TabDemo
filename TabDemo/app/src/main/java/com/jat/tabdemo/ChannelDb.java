package com.jat.tabdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cj.chen on 2016/6/15.
 */
public class ChannelDb {
    private static List<Channel> selectedChannel=new ArrayList<>();
    static{
        selectedChannel.add(new Channel("","头条",0,"",""));
        selectedChannel.add(new Channel("","娱乐",0,"",""));
        selectedChannel.add(new Channel("","体育",0,"",""));
        selectedChannel.add(new Channel("","财经",0,"",""));
        selectedChannel.add(new Channel("","热点",0,"",""));
        selectedChannel.add(new Channel("","科技",0,"",""));
        selectedChannel.add(new Channel("","图片",0,"",""));
        selectedChannel.add(new Channel("","汽车",0,"",""));
        selectedChannel.add(new Channel("","时尚",0,"",""));
    }
    public static  List<Channel> getSelectedChannel(){
        return selectedChannel;
    }
}
