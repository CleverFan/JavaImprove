package cn.improvecfan.test;

import cn.improvecfan.po.*;
import org.junit.Test;

/**
 * Created by chengfan on 2016/11/28.
 */
public class test {
    @Test
    public void testNoPackageOne(){
        Man man = new Man();
        man.name = "jack";
        man.money = 10000;

        Woman woman = new Woman();
        woman.name = "lucy";

        man.marry(woman);

        Thief thief = new Thief();
        thief.stealMoney(man);
        thief.stealWife(man);

        System.out.println(man.name + "的妻子：" + man.wife.name);
        System.out.println(man.name + "的钱:" + man.money);
    }

    @Test
    public void testPackageOne(){
        PackageMan man = new PackageMan("jack",10000);

        PackageWoman woman = new PackageWoman("lucy");

        man.marry(woman);

        System.out.println(man.getName() + "的妻子：" + man.getWife().getName());
        System.out.println(man.getName() + "的钱:" + man.getMoney());
    }

    @Test
    public void testPackageTwo(){
        PackageMan man = new PackageMan("jack",10000);

        PackageMan man1  = new PackageMan("tom",5);

        PackageWoman woman = new PackageWoman("lucy");

        man.marry(woman);

        man.setMoney(woman,20000);
        System.out.println(man.getName() + "的钱:" + man.getMoney());

        man.setMoney(man1,0);
    }
}
