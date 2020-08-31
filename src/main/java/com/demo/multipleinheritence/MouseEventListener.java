package com.demo.multipleinheritence;

public class MouseEventListener implements MouseClickEventListener, MoveMovementEventListener {
    public void singleClick() {
        System.out.println("Single Click Event Triggered");
    }

    public void doubleClick() {
        System.out.println("Double Click Event Triggered");
    }

    public void mouseUp() {
        System.out.println("Mouse Up Event Triggered");
    }

    public void mouseDown() {
        System.out.println("Mouse Down Event Triggered");
    }

    public void mouseMove() {
        System.out.println("Mouse Move Event Triggered");
    }
}
