package ANU7710;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema_management {

    private ArrayList<Cinema_zi> cinemaList=new ArrayList<>();

    public ArrayList<Cinema_zi> getCinemaList() {
        return cinemaList;
    }

    public void setCinemaList(ArrayList<Cinema_zi> cinemaList) {
        this.cinemaList = cinemaList;
    }


    public void addCinema(Cinema_zi c){
        cinemaList.add(c);
        System.out.println("该电影是："+cinemaList.get(cinemaList.size()-1).getName()+"，主演是："+cinemaList.get(cinemaList.size()-1).getActor()+"，类型是："+cinemaList.get(cinemaList.size()-1).getType());
        System.out.println("添加成功！");
    }


    public void removeCinema(){
        Scanner input=new Scanner(System.in);
        System.out.print("请输入要删除的电影(可输入演员或电影名)：");
        String data=input.next();
        for(int i=0;i<cinemaList.size();i++){
            if((cinemaList.get(i).getName().equals(data))||(cinemaList.get(i).getActor().equals(data))){
                System.out.println("该电影是："+cinemaList.get(i).getName()+"，主演是："+cinemaList.get(i).getActor()+"，类型是："+cinemaList.get(i).getType());
                cinemaList.remove(i);
                System.out.println("删除成功！");
                i--;
            }
        }
    }



    public void queryCinema(){
        Scanner input=new Scanner(System.in);
        System.out.print("请输入要查询的电影(可输入演员或电影名)：");
        String data=input.next();
        for(int i=0;i<cinemaList.size();i++){
            if((cinemaList.get(i).getName().equals(data))||(cinemaList.get(i).getActor().equals(data))){
                System.out.println("该电影是："+cinemaList.get(i).getName()+"，主演是："+cinemaList.get(i).getActor()+"，类型是："+cinemaList.get(i).getType());
                return;
            }
        }
        System.out.println("没有该电影！");
    }










}
