package edu.hunau.cxb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class User {

    private Integer id;
    private String username;
    private String pwd;

    //对日期格式进行处理
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    public User(Integer id, String username, String pwd, LocalDate birthday) {
        this.id = id;
        this.username = username;
        this.pwd = pwd;
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public User(Integer id, String username, String pwd) {
        this.id = id;
        this.username = username;
        this.pwd = pwd;
    }

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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
