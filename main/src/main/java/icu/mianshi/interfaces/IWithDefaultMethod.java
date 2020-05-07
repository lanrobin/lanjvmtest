package icu.mianshi.interfaces;

public interface IWithDefaultMethod {
    default void defaultMethod() {
        System.out.println("defaultMethod");
    }

    void nonDefaultMethod();
}
