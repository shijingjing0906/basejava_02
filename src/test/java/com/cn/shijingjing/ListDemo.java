package com.cn.shijingjing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by shijingjing on 2019/4/4.
 */
public class ListDemo {
    @Test
    public void fun1(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(55);
        arrayList.add(10);
        arrayList.add(32);
        arrayList.add(45);
        arrayList.add(67);
        arrayList.add(33);

        for (Integer i : arrayList){
            System.out.println(i);
        }
    }

    @Test
    public void fun2(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(55);
        arrayList.add(10);
        arrayList.add(32);
        arrayList.add(45);
        arrayList.add(67);
        arrayList.add(33);

        //正序
        Collections.sort(arrayList);
        for ( Integer i : arrayList) {
            System.out.println(i);
        }

        //倒序
        Collections.reverse(arrayList);
        for ( Integer i : arrayList) {
            System.out.println(i);
        }

    }

}
