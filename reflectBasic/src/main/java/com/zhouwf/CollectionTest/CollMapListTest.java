package com.zhouwf.CollectionTest;

import com.zhouwf.entity.Student;


import java.util.*;

public class CollMapListTest {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入以后才执行后面的内容，呵嘿:");
//        System.out.println("您刚刚输入的内容是：" + scanner.nextLine());
//        printSplitLine();
//        TestList();
//        printSplitLine();
        TestSet();
      printSplitLine();
        TestMap();
    }

    public static void TestList() {
        List<String> listString = new ArrayList<>();
        listString.add("zhouwf");
        listString.add("zhouzy");
        listString.add("lixy");

        for (String s : listString) {
            System.out.println(s);
        }
        for (int i = 0; i < listString.size(); i++) {
            System.out.println(listString.get(i));
        }
        for (Iterator<String> iterator = listString.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            System.out.println(next);
        }
    }

    public static void TestSet() {
        Set<Student> set = new HashSet<>();
        set.add(new Student(1, "zhouwf", 33));
        set.add(new Student(1, "zhouwf", 34));
        set.add(new Student(1, "zhouwf", 35));

        for (Iterator<Student> iterator = set.iterator(); iterator.hasNext(); ) {
            Student next = iterator.next();
            System.out.println(next);
        }
        Object[] objArray = set.toArray();
        for (Object o : objArray) {
            System.out.println(o);
        }

    }

    public static void TestMap() {
        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student(1, "zhouwf", 11));
        map.put(2, new Student(2, "zhouwf", 12));
        map.put(2, new Student(2, "zhouwf", 13));
        map.put(2, new Student(3, "zhouwf", 14));
        Set<Integer> setKey = map.keySet();
        for (Iterator<Integer> iterator = setKey.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            System.out.println(map.get(next));
        }

    }

    /**
     * 打印一条横线
     */
    public static void printSplitLine() {
        System.out.println("---------------------------------------------");
    }
}
