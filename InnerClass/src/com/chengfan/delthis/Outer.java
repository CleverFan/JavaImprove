package com.chengfan.delthis;

/**
 * @author chengfan
 * @create 2017-02-11 下午3:58
 */
public class Outer {
    private int num ;
    public Outer(){}

    public Outer(int num){
        this.num = num;
    }

    private class Inner{
        public Outer getTest2(){
            return Outer.this;
        }

        public Outer newTest2(){
            return new Outer();
        }
    }

    public static void main(String [] args){
        Outer test = new Outer(5);
        Outer.Inner inner = test.new Inner();
        Outer o1 = inner.getTest2();
        Outer o2 = inner.newTest2();
        System.out.println(o1.num); // 5
        System.out.println(o2.num); // 0
    }
}
