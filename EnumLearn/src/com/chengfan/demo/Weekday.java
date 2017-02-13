package com.chengfan.demo;

/**
 * @author chengfan
 * @create 2017-02-12 下午9:41
 */
public class Weekday {

    private Weekday(){}

    public final static Weekday SUN = new Weekday();
    public final static Weekday MON = new Weekday();
    public final static Weekday TUE = new Weekday();
    public final static Weekday WED = new Weekday();
    public final static Weekday THU = new Weekday();
    public final static Weekday FRI = new Weekday();
    public final static Weekday SAT = new Weekday();

    public static Weekday  getNextDay(Weekday nowDay){
        if(nowDay == SUN) {
            return MON;
        }else if(nowDay == MON) {
            return TUE;
        }else if(nowDay == TUE) {
            return WED;
        }else if(nowDay == WED) {
            return THU;
        }else if(nowDay == THU) {
            return FRI;
        }else if(nowDay == FRI) {
            return SAT;
        }else {
            return SUN;
        }
    }

    public static void printNowDay(Weekday nowDay){
        if(nowDay == SUN)
            System.out.println("sunday");
        else if(nowDay == MON)
            System.out.println("monday");
        else if(nowDay == TUE)
            System.out.println("tuesday");
        else if(nowDay == WED)
            System.out.println("wednesday");
        else if(nowDay == THU)
            System.out.println("thursday");
        else if(nowDay == FRI)
            System.out.println("friday");
        else
            System.out.println("saturday");
    }


    public static int toInt(Weekday nowDay){
        if(nowDay == SUN)
            return 0;
        else if(nowDay == MON)
            return 1;
        else if(nowDay == TUE)
            return 2;
        else if(nowDay == WED)
            return 3;
        else if(nowDay == THU)
            return 4;
        else if(nowDay == FRI)
            return 5;
        else
           return 6;
    }

}

class Test1{
    public static void main(String[] args) {
        Weekday nowday = Weekday.SUN;
        Weekday.printNowDay(nowday);
        Weekday nextDay = Weekday.getNextDay(nowday);
        System.out.print("nextday ====> ");
        Weekday.printNowDay(nextDay);
        Weekday.toInt(Weekday.SUN);
        System.out.println(nextDay);
    }
}
