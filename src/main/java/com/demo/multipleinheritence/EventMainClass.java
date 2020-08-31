package com.demo.multipleinheritence;

public class EventMainClass {

    public static void main(String args[]){
        MouseEventListener mouseEventListener = new MouseEventListener();
        mouseEventListener.doubleClick();
        mouseEventListener.mouseDown();
    }
}
