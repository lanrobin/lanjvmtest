package icu.mianshi.main;

public abstract class AbstractTestAttributes {
    public void sayHello() {
        System.out.println("I am TestAttributes");
    }

    @Deprecated
    public void deprecatedMethod() {
        int i = 0;
        int j = 1024;
        int k = i + j;
        System.out.println("I am deprecatedMethod:" + k);
    }
}
