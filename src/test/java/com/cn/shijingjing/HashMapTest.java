package com.cn.shijingjing;

import org.junit.Test;

import java.util.*;

/**
 * Created by shijingjing on 2019/4/4.
 */
public class HashMapTest {
    @Test
    public void fun(){
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("name", "石晶晶");
        hashMap.put("age", 18);
        hashMap.put("gender", "女");

        Iterator<Map.Entry<String, Object>> iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Object> next = iterator.next();
            System.out.println("key is : " + next.getKey());
            System.out.println("value is : " + next.getValue());
        }

    }

    @Test
    public void fun1(){
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("name", "石晶晶");
        hashMap.put("age", 18);
        hashMap.put("gender", "女");

        Set<Map.Entry<String, Object>> entries = hashMap.entrySet();
        for(Map.Entry en : entries){
            System.out.println("key is : " + en.getKey());
            System.out.println("value is : " + en.getValue());
        }

    }

    @Test
    public void fun2(){
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("name", "石晶晶");
        hashMap.put("age", 18);
        hashMap.put("gender", "女");

        Set<String> strings = hashMap.keySet();
        for (String key : strings){
            System.out.println("key is : " + key);
            System.out.println("value is : " + hashMap.get(key));
        }

    }

    @Test
    public void fun4(){
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("name", "石晶晶");
        linkedHashMap.put("age", 18);
        linkedHashMap.put("gender", "女");

        for (Map.Entry en : linkedHashMap.entrySet()){
            System.out.println("key is : " + en.getKey());
            System.out.println("value is : " + en.getValue());
        }

    }



}
