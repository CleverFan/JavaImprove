package cn.improvecfan.test;

import cn.improvecfan.javaclass.Person;
import cn.improvecfan.util.CloneUtils;
import org.junit.Test;

import java.lang.ref.SoftReference;

/**
 * Created by chengfan on 2016/11/27.
 */
public class TestPerson {
    @Test
    public void testPersonOne(){
        Person p = new Person();
        Person p2 = p;

        System.out.println(p);
        System.out.println(p2);
    }

    @Test
    public void testPersonTwo(){
        Person p1 = new Person();
        p1.setAge(10);

        change(p1);

        System.out.println("age = " + p1.getAge());
    }

    private void change(Person p){
        p = new Person();
        p.setAge(20);
    }

    @Test
    public void testPersonThree(){
        Person p1 = new Person();
        p1.setAge(10);

        changeAge(p1);

        System.out.println("age = " + p1.getAge());
    }

    private void changeAge(Person p){
        p.setAge(20);
    }

    public  void testSoftReference(){
        Person p = new Person();
        SoftReference<Person> sr = new SoftReference<Person>(p);
        if (sr != null) {
            p = sr.get();
        }else {
            p = new Person();
            sr = new SoftReference<Person>(p);
        }
    }

    @Test
    public void testClone(){
//        try {
//            //Person p = new Person("jack",12);
//
//            //Person p1 = p.clone();
//
//            //System.out.println(p1.getName()==p.getName() ? "是同一个对象啊怎么办" : "还好不一样");
//
//
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
    }
    @Test
    public  void testCloneUtil(){
        Person p =  new Person("张三",12);

        Person p1 =  CloneUtils.clone(p);

        System.out.println(p1.getName()==p.getName() ? "是同一个对象啊怎么办" : "还好不一样");

    }
}
