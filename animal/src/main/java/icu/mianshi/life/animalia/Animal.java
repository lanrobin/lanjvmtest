package icu.mianshi.life.animalia;

public abstract class Animal implements Runnable{
    protected  String liveEnvironment = "Earth";
    public void move() {
        System.out.println("I am animal. I can move.");
    }
}
