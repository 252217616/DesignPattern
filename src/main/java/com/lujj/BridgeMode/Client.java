package com.lujj.BridgeMode;

import com.lujj.BridgeMode.service.*;

/**
 * 桥梁模式
 */
public class Client {
    public static void main(String[] args) {
        House house = new House();
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();
        IPod Ipod = new IPod();
        ClothesCorp clothesCorp = new ClothesCorp(Ipod);
        clothesCorp.makeMoney();
    }
}
