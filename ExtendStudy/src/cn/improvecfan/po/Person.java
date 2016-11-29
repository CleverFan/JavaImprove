package cn.improvecfan.po;

/**
 * Created by chengfan on 2016/11/29.
 */
public class Person {
    protected String name;

    public void marry(Person p){
        System.out.println("marry");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
