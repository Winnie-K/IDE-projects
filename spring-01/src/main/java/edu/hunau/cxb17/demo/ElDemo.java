package edu.hunau.cxb17.demo;

import java.util.List;
import java.util.Map;

/*
*   spring表达式语言
* */
public class ElDemo {

   private double random;
   private String sub;
   private List<Integer>  lists;
   private Map<String,String> maps;

    @Override
    public String toString() {
        return "ElDemo{" +
                "random=" + random +
                ", sub='" + sub + '\'' +
                ", lists=" + lists +
                ", map=" + maps +
                '}';
    }

    public double getRandom() {
        return random;
    }

    public void setRandom(double random) {
        this.random = random;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public List<Integer> getLists() {
        return lists;
    }

    public void setLists(List<Integer> lists) {
        this.lists = lists;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }
}
