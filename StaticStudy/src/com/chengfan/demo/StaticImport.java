package com.chengfan.demo;
import static java.lang.Math.*;

/**
 * @author chengfan
 * @create 2017-01-28 下午4:52
 */
public class StaticImport {
    public static void main(String[] args) {
        double a = cos(PI / 2);
        double b = pow(2.4,1.2);

        double r = max(a,b);

        System.out.println(r);
    }
}
