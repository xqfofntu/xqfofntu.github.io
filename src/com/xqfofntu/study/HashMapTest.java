package com.xqfofntu.study;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Classname HashMapTest
 * @Date 2021/4/4
 * @Author xqf
 */
public class HashMapTest {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("a", "B");
        String place = map.put("a", "A");
        System.out.println(place);  //put返回被替换的键值

        System.out.println("---------------------------------");
        String val = map.get("a");
        System.out.println(val);

        System.out.println("---------------------------");

        map.put("b", "B");
        map.put("c", "C");
        map.put("d", "D");
        map.put("e", "E");
        map.put("f", "F");

        Set<String> keys = map.keySet();   //获取所有键的值
        for (String str : keys) {
            String vl = map.get(str);
            System.out.println(str + "-----" + vl);
        }

        System.out.println("----------------------------------");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String v = entry.getValue();
            System.out.println(key + "----" + v);
        }

        System.out.println("-------------------------------------");

        Map<String, String> map2 = new HashMap<>();
        map2.put("g", "G");
        map2.putAll(map);
        Set<String> key2 = map2.keySet();
        for (String str : key2) {
            System.out.println("key:" + str + " value:" + map2.get(str));
        }

    }
}
