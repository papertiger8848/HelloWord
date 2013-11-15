//:net/mindview/util/Print.java
//Print methods that can be used without
//qualifiers, using Java SE5 static imports:

package net.mindview.util;

import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * User: papertiger
 * Date: 10/3/13
 * Time: 3:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class Print {
    //Print with a newline:
    public static void print(Object obj) {
        System.out.println(obj);
    }

    //Print a newline by itself:
    public static void print() {
        System.out.println();
    }

    //Print with no line break:
    public static void printnb(Object obj) {
        System.out.println(obj);
    }

    //The new Java SE5 print()(from C):
    public static PrintStream
    printf(String format, Object ... args) {
        return System.out.printf(format, args);
    }

    public void updateGitHub(){

    }
} ///:~
