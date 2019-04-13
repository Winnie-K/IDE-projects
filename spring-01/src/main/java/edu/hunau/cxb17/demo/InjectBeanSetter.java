package edu.hunau.cxb17.demo;


import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*为了演示注入提供的演示代码*/
public class InjectBeanSetter {
    private Integer id;
    private String name;
    private String[] array;
    private List<String> lists;
    private Set<Integer> sets;
    private Map<String,String> maps;
    private Properties proes;

    public InjectBeanSetter() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "InjectBeanSetter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Set<Integer> getSets() {
        return sets;
    }

    public void setSets(Set<Integer> sets) {
        this.sets = sets;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Properties getProes() {
        return proes;
    }

    public void setProes(Properties proes) {
        this.proes = proes;
    }
}
