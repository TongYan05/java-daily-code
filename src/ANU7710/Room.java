package ANU7710;

import com.sun.jdi.Value;

import java.util.*;
import java.util.stream.Collectors;

public class Room {

//    private ArrayList<Card> cards = new ArrayList<Card>();
//
//    {
//        //创建牌
//        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
//        String[] patterns = {"♣", "♥", "♠", "♦"};
//        int num = 1;
//        for (String size : sizes) {
//            num++;
//            for (String pattern : patterns) {
//                cards.add(new Card(size, pattern,num));
//            }
//        }
//        Collections.addAll(cards, new Card("", "大王",++num), new Card("", "小王",++num));
//        System.out.println(cards);
//    }
//
//    public void start() {
//        //洗牌
//        Collections.shuffle(cards);
//        System.out.println(cards);
//
//        //发牌
//        Map<String, ArrayList<Card>> players = new HashMap<>();
//        ArrayList<Card> p1 = new ArrayList<>();
//        players.put("玩家1", p1);
//        ArrayList<Card> p2 = new ArrayList<>();
//        players.put("玩家2", p2);
//        ArrayList<Card> p3 = new ArrayList<>();
//        players.put("玩家3", p3);
//
//
//        List<Card> extraCards = cards.subList(cards.size() - 3, cards.size());
//        p1.addAll(extraCards);
//
//
//
//        for (int i = 0; i < cards.size() - 3; i++) {
//            if (i % 3 == 0) {
//                p1.add(cards.get(i));
//                players.put("玩家1", p1);
//            } else if (i % 3 == 1) {
//                p2.add(cards.get(i));
//                players.put("玩家2", p2);
//            } else {
//                p3.add(cards.get(i));
//                players.put("玩家3", p3);
//            }
//        }
//
//        sortCards(p1);
//        sortCards(p2);
//        sortCards(p3);
//
//
//        players.forEach((k, v) -> System.out.println(k + "的牌是" + v + " " + v.size()));
//
//
//    }
//
//
//    public static void sortCards(ArrayList<Card> cards) {
//        Collections.sort(cards, new Comparator<Card>() {
//            @Override
//            public int compare(Card o1, Card o2) {
//                return o2.getNum()-o1.getNum();
//            }
//        });
//    }


    public Room() {
    }
    {
        ArrayList<String> s=new ArrayList<String>();
        Collections.addAll(s,"3","4","5","6","7","8","9","10","J","Q","K","A","2");
        ArrayList<String> p=new ArrayList<String>();
        Collections.addAll(p,"♣","♥","♠","♦");
        ArrayList<Card> cards=new ArrayList<>();
        for(String size:s){
            for(String pattern:p){
                cards.add(new Card(size,pattern,s.indexOf(size)));
            }
        }
        Collections.addAll(cards,new Card("","小王",s.size()),new Card("","大王",s.size()));
        System.out.println(cards+" "+cards.size());

        Collections.shuffle(cards);
        System.out.println(cards);

        Map<String,ArrayList<Card>> players=new HashMap<>();
        ArrayList<Card> p1=new ArrayList<>();
        players.put("玩家1",p1);
        ArrayList<Card> p2=new ArrayList<>();
        players.put("玩家2",p2);
        ArrayList<Card> p3=new ArrayList<>();
        players.put("玩家3",p3);
        for(int i=0;i<cards.size()-3;i++){
            if(i%3==0){
                p1.add(cards.get(i));
            }
            else if(i%3==1){
                p2.add(cards.get(i));
            }
            else{
                p3.add(cards.get(i));
            }
        }
        Collections.addAll(p1,cards.get(cards.size()-3),cards.get(cards.size()-2),cards.get(cards.size()-1));
        System.out.println(p1+"\n"+p2+"\n"+p3);
        System.out.println(players);
        players.forEach((k,v)-> System.out.println(k+"的牌是"+v+"数量是："+v.size()+"张"));

        for(String k:players.keySet()){
            players.get(k).sort(new Comparator<Card>() {
                @Override
                public int compare(Card o1, Card o2) {
                    return o2.getNum()-o1.getNum();
                }
            });
        }
        System.out.println(players);
        players.forEach((k,v)-> System.out.println(k+"的牌是"+v+"数量是："+v.size()+"张"));

    }




















}