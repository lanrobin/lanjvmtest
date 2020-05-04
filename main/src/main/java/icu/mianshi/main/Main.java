package icu.mianshi.main;

public class Main {
    public static void main(String[] args) {
        Integer[][] is = new Integer[][]
                {{1,2,3,4,5,6},
                 {6,5,4,3,2,1}};
        //Integer is = 1;
        Class<?> clz = is.getClass();
        while(clz != null) {
            System.out.println("Class:" + clz.getCanonicalName() +", superclass:" + clz.getSuperclass().getCanonicalName());
            clz = clz.getClass();
        }
    }
}
