package edu.hunau.cxb.wf.pojo;

public class Account {
    private Integer id;//编号
    private String name;//账户名
    private double balancy;//余额

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balancy=" + balancy +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalancy() {
        return balancy;
    }

    public void setBalancy(double balancy) {
        this.balancy = balancy;
    }
}
