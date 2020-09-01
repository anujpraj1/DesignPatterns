package com.demo.accessmodifiers.privatemethodpackage;

//private
public class PrivateMethodClass {

    private void privateMethod () {
        System.out.println("Private Method");
    }

    public static void main (String args[]) {
        PrivateMethodClass privateMethodClass = new PrivateMethodClass();
        privateMethodClass.privateMethod();
    }
}
