package com.xyzbank.base;

public class PageObject {


    public void waitSecond(int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
