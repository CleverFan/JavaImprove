package cn.improvecfan.po;

/**
 * Created by chengfan on 2016/11/28.
 */
public class PackageWoman {
    private String name;
    private PackageMan husband;

    public void marry(PackageMan man){
        this.husband = man;
    }

    public PackageWoman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public PackageMan getHusband() {
        return husband;
    }

    public void setName(String name) {
        this.name = name;
    }
}
