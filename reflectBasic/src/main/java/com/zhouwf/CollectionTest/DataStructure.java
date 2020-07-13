package com.zhouwf.CollectionTest;

import java.util.Collection;
import java.util.Iterator;

public class DataStructure {
    /*
    循环的遍历
     */
    public static void main(String[] args) {
        int[] integers = {1, 2, 3, 4};
        for (int j = 0; j < integers.length; j++) {
            System.out.println(integers[j]);
        }

        String[] strings={"a","b","c","d"};
        Collection stringLists=java.util.Arrays.asList(strings);
        for(Iterator itr=stringLists.iterator();itr.hasNext();){
            Object str=itr.next();
            System.out.println(str);
        }
        for (Object str:stringLists){
            System.out.println(str);
        }

        for (Integer i:integers){
            System.out.println(i);
        }
    }
}
