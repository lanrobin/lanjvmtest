package icu.mianshi.interfaces;

public class NoOverrideDefaultClass implements IWithDefaultMethod{
    @Override
    public void nonDefaultMethod() {
        int i = 0;
        int b = 199;
        int c = i + b;
        System.out.println("i + b = " + c);
    }
}
