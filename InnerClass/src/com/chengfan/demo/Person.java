package com.chengfan.demo;

/**
 * @author chengfan
 * @create 2017-02-11 下午4:36
 */
public class Person {
    //这里是private
    private class PEat implements Eat {
        @Override
        public void eat() {
            System.out.println("eat with mouse");
        }
    }

    //这里是protected
    protected class PRun implements Run{
        @Override
        public void run() {
            System.out.println("run with leg");
        }
    }

    public Eat howToEat(){
        return new PEat();
    }

    public Run houToRun(){
        return new PRun();
    }
}

class TestPerson{
    public static void main(String[] args) {
        Person p = new Person();
        Eat e = p.howToEat();
        Run r = p.houToRun();

        e.eat();
        r.run();

        Person.PRun ppr = p.new PRun();
        //Person.PEat ppe = p.new PEat(); 编译失败
    }
}
