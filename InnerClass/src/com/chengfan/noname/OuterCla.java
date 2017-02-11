package com.chengfan.noname;

/**
 * @author chengfan
 * @create 2017-02-11 下午9:24
 */
public class OuterCla {

    class InnerClassImpl implements InnerClass{
        int number ;
        public InnerClassImpl(int num){
            number = num + 3;
        }
        public int getNumber(){
            return number;
        }
    }
    public InnerClass getInnerClass(final int num){
        return new InnerClassImpl(2);
    }

    public static void main(String[] args) {
        OuterCla out = new OuterCla();
        InnerClass inner = out.getInnerClass(2);
        System.out.println(inner.getNumber());
    }
}
