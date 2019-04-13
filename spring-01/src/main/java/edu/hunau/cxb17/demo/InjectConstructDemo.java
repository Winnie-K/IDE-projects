package edu.hunau.cxb17.demo;

/*构造器注入方式*/
public class InjectConstructDemo {
    //无须提供getter和setter方法
    private String datas;
    private  int n;

    public InjectConstructDemo(String datas,int n) {
        this.datas = datas;
        this.n = n;
    }

    @Override
    public String toString() {
        return "InjectConstructDemo{" +
                "datas='" + datas + '\'' +
                ", n=" + n +
                '}';
    }
}
