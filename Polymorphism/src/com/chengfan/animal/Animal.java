package com.chengfan.animal;

/**
 * @author chengfan
 * @create 2017-01-26 下午7:02
 */
public class Animal {
    public void eat(){
        System.out.println("animal eatting...");
    }
}

class Cat extends Animal{

    public void eat(){

        System.out.println("我吃鱼");
    }
}

class Dog extends Animal{

//    public void eat(){
//
//        System.out.println("我吃骨头");
//    }

    public void run(){
        System.out.println("我会跑");
    }
}

class Main {

    public static void main(String[] args) {

//        Animal animal = new Cat(); //向上转型
//        animal.eat();
//
//        animal = new Dog();
//        animal.eat();

        Animal a = new Cat();
        Cat c = ((Cat) a);
        c.eat();

//        Dog d = ((Dog) a);
//        d.eat();

        Animal a1 = new Animal();
        Cat c1 = ((Cat) a1);
        c1.eat();


        //b.fly();  //此处提示在Animal中没有定义fly方法。
    }

}