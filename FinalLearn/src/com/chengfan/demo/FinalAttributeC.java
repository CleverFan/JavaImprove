package com.chengfan.demo;

/**
 * @author chengfan
 * @create 2017-01-31 下午8:25
 */
public class FinalAttributeC {
    private final Person person = new Person("zhangbingxiao");

    public void change(){
        person.setName("chengfan");
        System.out.println(person.getName());
    }
    public void change(Person p){
        //this.person = p;
    }

    public static void main(String[] args) {
        new FinalAttributeC().change();
    }

}
