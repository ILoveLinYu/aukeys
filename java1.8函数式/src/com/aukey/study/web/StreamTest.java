package com.aukey.study.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aukey.study.Apple;

/**
 * java 1.8一些普通方法的使用
 * @author zzj
 *
 */
public class StreamTest {
     public static void main(String[] args) {
    	 List<Apple> list=new ArrayList<Apple>();
 		Apple a1=new Apple();
 		a1.setColor("红色");
 		a1.setWeight(1.30);
 		list.add(a1);
 		Apple a2=new Apple();
 		a2.setColor("红色");
 		a2.setWeight(1.60);
 		list.add(a2);
 		Apple a3=new Apple();
 		a3.setColor("红色");
 		a3.setWeight(1.00);
 		list.add(a3);
 		Apple a4=new Apple();
 		a4.setColor("gggg");
 		a4.setWeight(10.2);
 		list.add(a4);
 		//排序
 		Collections.sort(list, Comparator.comparing(Apple::getWeight)); 
		//list.stream().map(Apple::getWeight).forEach(System.out::println);
		//peek方法是消费函数，可以在里面对对象的属性值进行修改
		List<Apple> doubleList=list.stream().peek(x -> {
			x.setWeight(562.00);
		}).collect(Collectors.toList());
		doubleList.stream().map(Apple::getWeight).forEach(System.out::println);
	}
}
