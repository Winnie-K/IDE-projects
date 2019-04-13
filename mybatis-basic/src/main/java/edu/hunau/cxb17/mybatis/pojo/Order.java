package edu.hunau.cxb17.mybatis.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Order implements Serializable {
    private String id;
    private double total;
    private Integer nums;
    private LocalDateTime dotime;

    //一个订单会对应一个用户
    private User u;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public LocalDateTime getDotime() {
        return dotime;
    }

    public void setDotime(LocalDateTime dotime) {
        this.dotime = dotime;
    }

    public void setU(User u) {
        this.u = u;
    }

    public User getU() {
        return u;
    }
}
