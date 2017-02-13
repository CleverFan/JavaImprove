package com.chengfan.enum2;

/**
 * Created by chengfan on 2017/2/13.
 */
public enum Weekday {
    SUN,MON,TUS,WED,THU,FRI,SAT
}

class Test3{
    public static void main(String[] args) {
        System.out.println(Weekday.valueOf("mon".toUpperCase()));
        //MON

        for (Weekday w : Weekday.values()){
            System.out.println(w + ".ordinal()  ====>" +w.ordinal());
        }
        //SUN.ordinal()  ====>0
        //MON.ordinal()  ====>1
        //TUS.ordinal()  ====>2
        //WED.ordinal()  ====>3
        //THU.ordinal()  ====>4
        //FRI.ordinal()  ====>5
        //SAT.ordinal()  ====>6

        System.out.println("Weekday.MON.compareTo(Weekday.FRI) ===> " + Weekday.MON.compareTo(Weekday.FRI));
        System.out.println("Weekday.MON.compareTo(Weekday.MON) ===> " + Weekday.MON.compareTo(Weekday.MON));
        System.out.println("Weekday.MON.compareTo(Weekday.SUM) ===> " + Weekday.MON.compareTo(Weekday.SUN));
        //Weekday.MON.compareTo(Weekday.FRI) ===> -4
        //Weekday.MON.compareTo(Weekday.MON) ===> 0
        //Weekday.MON.compareTo(Weekday.SUM) ===> 1

        System.out.println("Weekday.MON.name() ====> " + Weekday.MON.name());
        //Weekday.MON.name() ====> MON

    }
}
