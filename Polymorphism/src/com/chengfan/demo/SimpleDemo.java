package com.chengfan.demo;

/**
 * @author chengfan
 * @create 2017-01-26 下午8:28
 */
public class SimpleDemo {

}

class X {
    public void show(Y y){
        System.out.println("x and y");
    }

    public void show(){
        System.out.println("only x");
    }
}

class Y extends X {
    public void show(Y y){
        System.out.println("y and y");
    }

    public void show(int i){

    }
}

class main{
    public static void main(String[] args) {
        X x = new Y();
        x.show(new Y());
        x.show();
    }
}
