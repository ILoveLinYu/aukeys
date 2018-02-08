package com.aukey.study.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aukey.study.Apple;

/**
 * java 1.8һЩ��ͨ������ʹ��
 * @author zzj
 *
 */
public class StreamTest {
     public static void main(String[] args) {
    	 List<Apple> list=new ArrayList<Apple>();
 		Apple a1=new Apple();
 		a1.setColor("��ɫ");
 		a1.setWeight(1.30);
 		list.add(a1);
 		Apple a2=new Apple();
 		a2.setColor("��ɫ");
 		a2.setWeight(1.60);
 		list.add(a2);
 		Apple a3=new Apple();
 		a3.setColor("��ɫ");
 		a3.setWeight(1.00);
 		list.add(a3);
 		Apple a4=new Apple();
 		a4.setColor("gggg");
 		a4.setWeight(10.2);
 		list.add(a4);
 		//����
 		Collections.sort(list, Comparator.comparing(Apple::getWeight)); 
		//list.stream().map(Apple::getWeight).forEach(System.out::println);
		//peek���������Ѻ���������������Զ��������ֵ�����޸�
		List<Apple> doubleList=list.stream().peek(x -> {
			x.setWeight(562.00);
		}).collect(Collectors.toList());
		doubleList.stream().map(Apple::getWeight).forEach(System.out::println);
	}
}
