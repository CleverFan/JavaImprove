package com.chengfan.me;

import com.chengfan.pen.Pen;

/**
 * @author chengfan
 * @create 2017-01-20 下午9:05
 */
public class You {
    private Pen pen;

    public You(Pen p){
        this.pen = p;
    }

    public void write(){
        pen.write();
    }
}
