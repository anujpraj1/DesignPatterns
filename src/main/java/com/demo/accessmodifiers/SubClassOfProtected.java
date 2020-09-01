package com.demo.accessmodifiers;

import com.demo.accessmodifiers.protectedclasspackage.ProtectedClass;

public class SubClassOfProtected extends ProtectedClass {

    public static void main(String args[]) {
        SubClassOfProtected subClassOfProtected = new SubClassOfProtected();
        subClassOfProtected.protectedMethod();
    }
}
