package com.anu.basic;

public class university {
    public university(){
        this.name="ANU";
        this.title="group of eight";
        this.ranking=30;
    }
    public university(String name,String title,int ranking){
        System.out.println(name+"\t"+title+"\t"+ranking);
        this.name=name;
        this.title=title;
        this.ranking=ranking;
    }
    private String name;
    private String title;
    private int ranking;
    public void setName(String name){this.name=name;}
    public void setTitle(String title){this.title=title;}
    public void setRanking(int ranking){this.ranking=ranking;}
    public String getName(){return this.name;}
    public String getTitle(){return this.title;}
    public int getRanking(){return this.ranking;}



}
