package com.zhouwf.EnumTest;

import com.zhouwf.Utils.EnumUtils;

import java.util.Optional;

public class MyEnumTest {


    public static void main(String[] args) {
        System.out.println(MyEnum.PaiLei.getCode());
        System.out.println(MyEnum.PaiLei.ordinal());
        System.out.println(MyEnum.XiuXian.getDescription());
        System.out.println(MyEnum.values()[0].name());
        System.out.println(MyEnum.valueOf("PaiLei").getCode());

        for (MyEnum item : MyEnum.values()) {
            System.out.println(item.getCode() + item.getDescription());
        }

        Optional<MyEnum> m = EnumUtils.getEnumObject(MyEnum.class, e -> e.getCode() == 1000);
        System.out.println(m.isPresent() ? m.get().getDescription() : null);
        Optional<MyEnum> m1 = EnumUtils.getEnumObject(MyEnum.class, e -> e.getDescription().equals("休闲"));
        System.out.println(m1.isPresent() ? m1.get().getCode() : null);

    }
}
