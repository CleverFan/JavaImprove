package com.chengfan.noname;

/**
 * @author chengfan
 * @create 2017-02-11 下午9:19
 */
public class OuterClass {
    public InnerClass getInnerClass(final int num,String str2){
        return new InnerClass(){
            int number = num + 3;
            public int getNumber(){
                return number;
            }
        };//注意：分号不能省
    }

    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        InnerClass inner = out.getInnerClass(2, "chengfan");
        System.out.println(inner.getNumber());
    }
}

interface InnerClass {
    int getNumber();
}
