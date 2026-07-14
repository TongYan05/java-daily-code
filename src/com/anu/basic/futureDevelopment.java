package com.anu.basic;

public enum futureDevelopment {
    LiuGuo("南方科技大学"),TongYan("Australian National University"),WangWenJie("大连海事大学"),ZhouFuBin("福建华东船厂");
    private String name;
    private futureDevelopment(String name){this.name=name;}
    public String getName(){return name;}
}
