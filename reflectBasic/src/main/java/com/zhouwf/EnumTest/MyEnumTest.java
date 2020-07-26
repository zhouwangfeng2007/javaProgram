package com.zhouwf.EnumTest;

public class MyEnumTest {
    public static void main(String[] args) {
        System.out.println(MyEnum.PaiLei.getCode());
        System.out.println(MyEnum.PaiLei.ordinal());
        System.out.println(MyEnum.XiuXian.getDescription());
        System.out.println(MyEnum.values()[0].name());
        System.out.println(MyEnum.valueOf("PaiLei").getCode());
    }
}
