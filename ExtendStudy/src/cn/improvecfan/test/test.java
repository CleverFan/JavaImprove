package cn.improvecfan.test;

import cn.improvecfan.po.Man;
import cn.improvecfan.po.Woman;
import org.junit.Test;

/**
 * Created by chengfan on 2016/11/29.
 */
public class test {
    @Test
    public void testCons(){
        Man man = new Man();
        man.setName("jack");

        Woman woman = new Woman();
        woman.setName("lucy");
        man.marry(woman);

        Man m = new Man();
        m.setName("tom");

        man.setMoney(man,10000);
        System.out.println(man.getName()+"的钱： "+ man.getMoney());

        man.setMoney(woman,20000);

        System.out.println(man.getName()+"的钱： "+ man.getMoney());

        man.setMoney(m,0);

        System.out.println(man.getName()+"的钱： "+ man.getMoney());

    }
}
