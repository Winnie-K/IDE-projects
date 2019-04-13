package edu.hunau.cxb.sm.pojo;

import edu.hunau.cxb.sm.pojo.Order;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/*封装实体类*/
public class User implements Serializable{
    private  Integer id;
    private String username;
    private String gender;
    private String pwd;
    private Date dotime;

    //一个用户可能存在多个订单
    private List<Order> orders;

    public User() {
    }

    //getter和setter方法提供:alt和ins键

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getDotime() {
        return dotime;
    }

    public void setDotime(Date dotime) {
        this.dotime = dotime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", pwd='" + pwd + '\'' +
                ", dotime=" + dotime +
                '}';
    }

    public List<Order> getOrders() {
        return orders;
    }
}
