package com.meitu.lyz.designpatterndemo;

/**
 * 单例模式
 *
 * @author LYZ 2018.07.18
 */
public class SingletonPattern {


    /**
     * 饿汉式
     */
    private static final SingletonPattern singletonPattern1 = new SingletonPattern();

    public static SingletonPattern getInstance1() {
        return singletonPattern1;
    }


    /**
     * 懒汉式
     */
    private static SingletonPattern singletonPattern2;

    public static SingletonPattern getInstance2() {
        if (singletonPattern2 == null) {
            singletonPattern2 = new SingletonPattern();
        }
        return singletonPattern2;
    }

    /**
     * 静态方法加同步
     */
    private static SingletonPattern singletonPattern3;

    public synchronized static SingletonPattern getInstance3() {
        if (singletonPattern3 == null) {
            singletonPattern3 = new SingletonPattern();
        }
        return singletonPattern3;
    }


    /**
     * double-check
     */
    private volatile static SingletonPattern singletonPattern4;

    public static SingletonPattern getInstance4() {
        if (singletonPattern4 == null) {
            synchronized (SingletonPattern.class) {
                if (singletonPattern4 == null) {
                    singletonPattern4 = new SingletonPattern();
                }
            }
        }
        return singletonPattern4;
    }


    /**
     * 静态内部类
     */
    private static final class SingletonPatternHolder {
        private static final SingletonPattern singletonPattern5 = new SingletonPattern();
    }

    public static SingletonPattern getInstance5() {
        return SingletonPatternHolder.singletonPattern5;
    }


}
