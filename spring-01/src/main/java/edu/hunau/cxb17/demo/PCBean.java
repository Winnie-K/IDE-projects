package edu.hunau.cxb17.demo;

public class PCBean {

    private String  str;
    private Integer id;

    public PCBean() {
    }

    public PCBean(String str,Integer id) {
        this.str = str;
        this.id = id;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PCBean{" +
                "str='" + str + '\'' +
                ", id=" + id +
                '}';
    }
}
