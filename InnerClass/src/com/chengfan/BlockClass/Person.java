package com.chengfan.BlockClass;

/**
 * @author chengfan
 * @create 2017-02-11 下午8:58
 */
public class Person {
    public Eat howToEat(){
        // 定义在方法中的类
        class EatWithMouth implements Eat{
            @Override
            public void eat() {
                System.out.println("eat with mouth");
            }
        }
        // 向上转型
        return new EatWithMouth();
    }

    public static void main(String[] args) {
        Eat e = new Person().howToEat();
        e.eat(); // eat with mouth
    }
}
