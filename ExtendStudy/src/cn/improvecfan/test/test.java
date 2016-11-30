package cn.improvecfan.test;

import cn.improvecfan.po.Man;
import cn.improvecfan.po.Woman;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengfan on 2016/11/29.
 */
public class test {
    private Man man1;



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

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            
        }

        for (int i = l.size() - 1; i >= 0; i--) {
            
        }

        System.out.println(man);
        System.out.println(man);
        System.out.println(man);
        System.out.println(((Object) man));



        for (Integer i : l) {
            if (man == null) {
                if (man != null) {
                    if (man != null) {
                        System.out.println(man);
                        man1 = new Man();
                        if (man1 != null) {
                            if (man != null) {

                            }
                        }
                    }
                }
            }
        }

    }
    
}
