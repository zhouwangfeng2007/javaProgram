package com.zhouwf.CollectionTest;

import java.util.*;

public class CollMapTest {
    public static void main(String[] args) {
        Map<Integer, String> mapPoker = getArrayListString();
        List<Integer> listIds = fetchIds(mapPoker);
        Collections.shuffle(listIds);
        System.out.println(listIds);
        Map<String, List<Integer>> result = sendPoker(listIds);
        Set<String> keySet = result.keySet();
        for (String s : keySet) {
            String pkResult = convert(result.get(s), mapPoker);
            System.out.println(s + " " + pkResult);
        }
    }

    private static Map<Integer, String> getArrayListString() {
        Map<Integer, String> pokers = new HashMap<>();
        String[] colors = new String[]{"红桃", "黑桃", "梅花", "方块"};
        String[] numbers = new String[]{"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                pokers.put(index, color + number);
                index = index + 1;
            }
        }
        pokers.put(index, "小王");
        pokers.put(++index, "大王");
        System.out.println(pokers);

        return pokers;
    }

    private static List<Integer> fetchIds(Map<Integer, String> poker) {
        List<Integer> listIds = new ArrayList<>();
        Set<Integer> idSet = poker.keySet();
        for (Iterator<Integer> iterator = idSet.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            listIds.add(next);
        }
        System.out.println(listIds);
        return listIds;
    }

    private static Map<String, List<Integer>> sendPoker(List<Integer> listIds) {
        List<Integer> zhouwf = new ArrayList<>();
        List<Integer> zhouzy = new ArrayList<>();
        List<Integer> lixy = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();
        System.out.println("aaaa:" + listIds);
        for (int i = 0; i < listIds.size(); i++) {
            Integer listId = listIds.get(i);

            if (i < listIds.size() - 3) {
                Integer mod = i % 3;
                switch (mod) {
                    case 0:
                        zhouwf.add(listId);
                        break;
                    case 1:
                        zhouzy.add(listId);
                        break;
                    case 2:
                        lixy.add(listId);
                        break;
                }
            } else {
                dipai.add(listId);
            }
        }
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("zhouwf", zhouwf);
        map.put("zhouzy", zhouzy);
        map.put("lixy", lixy);
        map.put("dipai", dipai);
        return map;
    }

    private static String convert(List<Integer> personPoker, Map<Integer, String> standardPoker) {
        Collections.sort(personPoker);
        StringBuilder sb = new StringBuilder();
        for (Integer integer : personPoker) {
            sb.append(standardPoker.get(integer) + " ");
        }
        return sb.toString().trim();
    }

}
