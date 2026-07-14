package com.anu.basic;

public enum G8 {
    usyd("悉尼大学"),unsw("新南威尔士大学"),uq("昆士兰大学"),anu("澳大利亚国立大学");
    private String title;
    private G8(String title){
        this.title = title;
        System.out.println(title);
    }
    public String getTitle(){return title;}
}
