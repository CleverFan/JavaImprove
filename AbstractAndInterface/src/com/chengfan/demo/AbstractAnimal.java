package com.chengfan.demo;

/**
 * @author chengfan
 * @create 2017-02-10 下午3:04
 */
public abstract class AbstractAnimal {

    public abstract void move();

    public void see(){
        System.out.println("see with eye");
    }
}

abstract class b extends AbstractAnimal{
    public abstract void move();
}
