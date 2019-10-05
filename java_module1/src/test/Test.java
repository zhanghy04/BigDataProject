package test;

import java.util.ArrayList;

/**
 * @author 竹叶青
 * @create 2019/10/5-18:14
 */
public class Test {
    private static final int p=20;

    public static void main(String[] args) {
        String[] strArr = {"张三", "李四", "王五"};

        ArrayList list = new ArrayList();
        list.add("张三");
        list.add(12);
        list.add(45.23);
        for (Object o : list) {
            System.out.println(o);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        if (list == null) {
            if (strArr != null) {
                System.out.println(strArr);
            }
        }
        if (args != null) {
            if (list != null) {
                if (strArr == null) {

                }
            }
        }

    }

    public void testMyTest(){
        System.out.println("");
    }
    public static void print() {
        System.out.println("这是print方法");
        String str = "zhangsan 李四";
        System.out.println("str = " + str);
    }

    public static void print(Object obj) {
        System.out.println(obj);
        System.out.println("obj = [" + obj + "]");
    }
}
