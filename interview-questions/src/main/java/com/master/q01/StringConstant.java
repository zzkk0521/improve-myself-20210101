package com.master.q01;

public class StringConstant {

    public static void main(String[] args) {
        String m = new StringBuilder().append("58").append("tongcheng").toString();
        String n = m.intern();
        System.out.println("-----------------m=" + m);//58tongcheng
        System.out.println("-----------------n=" + n);//58tongcheng
        System.out.println(m == n);//true

        String a = new StringBuilder().append("ja").append("va").toString();
        String b = a.intern();
        System.out.println("-----------------a=" + a);//java
        System.out.println("-----------------b=" + b);//java
        System.out.println(a == b);//false

        /**
         * 这里java字符串答案为false，说明必然是两个不同的java,那么另外一个java字符串是如何加载进来的呢？
         * 有一个初始化的java字符串（JDK出娘胎自带的），在加载sun.misc.Version这个类的时候进入常量池
         */
    }


    /**
     * String.intern()是一个本地方法，它的作用是如果字符创常量池中已经包含一个等于此String对象的
     * 字符串，则返回代表池中这个字符串的String对象的引用；否则，会将此String对象包含的字符串添加到
     * 常量池中，并且返回此String对象的引用。在JDK6或者更早的HotSpot虚拟机中，常量池都是分配在永久
     * 代中，我们可以通过-XX：PermSize和—XX：MaxPermSize限制永久代的大小，即可间接限制其中常量池的容量
     */
}
