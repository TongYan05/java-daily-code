package ANU7710;

import java.util.ArrayList;

public class Cinema_test {
//    需求
//    开发一个电影信息管理模块，用户可以上架电影，查询电影，下架某部电影，以及下架某个主演参演的全部电影。
//    分析
//    每部电影都是一个电影对象，设计电影类。
//    需要定义一个电影操作类，其对象专门用于处理电影数据的业务。
//    操作类中需要定义一个集合存放全部的电影对象
    public static void main(String[] args) {


        //创建20个完全不同的电影
        Cinema_management cm=new Cinema_management();
        Cinema_zi c1=new Cinema_zi("《唐顿庄园》","张三","动作");
        Cinema_zi c2=new Cinema_zi("《星际穿越》","李四","科幻");
        Cinema_zi c3=new Cinema_zi("《泰坦尼克号》","王五","爱情");
        Cinema_zi c4=new Cinema_zi("《复仇者联盟》","赵六","动作");
        Cinema_zi c5=new Cinema_zi("《盗梦空间》","陈七","悬疑");
        Cinema_zi c6=new Cinema_zi("《阿凡达》","刘八","科幻");
        Cinema_zi c7=new Cinema_zi("《速度与激情》","褚十三","动作");
        Cinema_zi c8=new Cinema_zi("《哈利·波特》","褚十三","奇幻");
        Cinema_zi c9=new Cinema_zi("《肖申克的救赎》","褚十三","剧情");
        Cinema_zi c10=new Cinema_zi("《千与千寻》","褚十三","动画");
        Cinema_zi c11=new Cinema_zi("《流浪地球》","褚十三","科幻");
        Cinema_zi c12=new Cinema_zi("《我不是药神》","卫十四","剧情");
        Cinema_zi c13=new Cinema_zi("《哪吒之魔童降世》","蒋十五","动画");
        Cinema_zi c14=new Cinema_zi("《红海行动》","沈十六","战争");
        Cinema_zi c15=new Cinema_zi("《摔跤吧！爸爸》","韩十七","运动");
        Cinema_zi c16=new Cinema_zi("《寻梦环游记》","杨十八","动画");
        Cinema_zi c17=new Cinema_zi("《疯狂动物城》","朱十九","喜剧");
        Cinema_zi c18=new Cinema_zi("《让子弹飞》","姜二十","喜剧");
        Cinema_zi c19=new Cinema_zi("《霸王别姬》","张二一","剧情");
        Cinema_zi c20=new Cinema_zi("《大话西游》","周二二","喜剧");

        ArrayList<Cinema_zi> cinemaList=new ArrayList<>();
        cm.addCinema(c1);
        cm.addCinema(c2);
        cm.addCinema(c3);
        cm.addCinema(c4);
        cm.addCinema(c5);
        cm.addCinema(c6);
        cm.addCinema(c7);
        cm.addCinema(c8);
        cm.addCinema(c9);
        cm.addCinema(c10);
        cm.addCinema(c11);
        cm.addCinema(c12);
        cm.addCinema(c13);
        cm.addCinema(c14);
        cm.addCinema(c15);
        cm.addCinema(c16);
        cm.addCinema(c17);
        cm.addCinema(c18);
        cm.addCinema(c19);
        cm.addCinema(c20);

        cm.removeCinema();

//        cm.queryCinema();





    }
}
