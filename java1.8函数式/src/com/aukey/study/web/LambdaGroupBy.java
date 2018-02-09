package com.aukey.study.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.aukey.study.Apple;
import com.aukey.study.utils.BigDecimalUtil;
import com.aukey.study.utils.Lists;

/**
 * java 1.8 �ķ��鷽��
 * @author zzj
 *
 */
public class LambdaGroupBy {
	public static void main(String[] args) {
		List<Apple> list = new ArrayList<Apple>();
		Apple a1 = new Apple();
		a1.setColor("��ɫ");
		a1.setWeight(1.30);
		list.add(a1);
		Apple a2 = new Apple();
		a2.setColor("��ɫ");
		a2.setWeight(1.60);
		list.add(a2);
		Apple a3 = new Apple();
		a3.setColor("��ɫ");
		a3.setWeight(1.00);
		list.add(a3);
		Apple a4 = new Apple();
		a4.setColor("��ɫ");
		a4.setWeight(10.2);
		list.add(a4);
		//�ȸ�����ɫ���飬�ٸ�����������
		Map<String,Map<Double,List<Apple>>> groupMoreMap=list.stream().collect(Collectors.groupingBy(Apple::getColor,Collectors.groupingBy(Apple::getWeight)));
		for(Entry<String,Map<Double,List<Apple>>> entry:groupMoreMap.entrySet()){
			System.out.println("key1:"+entry.getKey());
			for(Entry<Double,List<Apple>> en:entry.getValue().entrySet()){
				System.out.println("key2:"+en.getKey());
			}
		}
		//������ɫ����
		Map<String,List<Apple>> groupMap=list.stream().collect(Collectors.groupingBy(Apple::getColor));
		for(Entry<String,List<Apple>> entry:groupMap.entrySet()){
			System.out.println("key:"+entry.getKey()+"value:"+entry.getValue().stream().map(Apple::getColor).collect(Collectors.joining(",")));
		}
		//������ɫ���飬����������
		Map<String,List<Double>> groupMap2=list.stream().collect(Collectors.groupingBy(Apple::getColor,Collectors.mapping(Apple::getWeight, Collectors.toList())));
		for(Entry<String,List<Double>> entry:groupMap2.entrySet()){
			System.out.println("key:"+entry.getKey()+"value:"+BigDecimalUtil.sub(entry.getValue().stream().reduce(0.00,(sum,item)-> sum+item).doubleValue(),0,2));
		}
		//������ɫ���飬ͳ�Ƹ���
		Map<String,Long> groupMap3=list.stream().collect(Collectors.groupingBy(Apple::getColor,Collectors.counting()));
		for(Entry<String,Long> entry:groupMap3.entrySet()){
			System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
		}
		//list���map(��key�ظ���ʹ�����һ��valueΪֵ)
		Map<String,Apple> appleMap=list.stream().collect(Collectors.toMap(Apple::getColor,a -> a,(v1,v2) -> v2));
		for(Entry<String,Apple> entry:appleMap.entrySet()){
			System.out.println("key:"+entry.getKey()+";value:"+entry.getValue().getColor()+";"+entry.getValue().getWeight());
			
		}
		//list���map(��key�ظ���ʹ��list�ռ�)
		Map<String,List<Apple>> appleListMap=list.stream().collect(Collectors.toMap(Apple::getColor,a -> Lists.newArrayList(a),(List<Apple> oldList,List<Apple> newList) -> {
			oldList.addAll(newList);
			return oldList;
		}));
		for(Entry<String,List<Apple>> entry:appleListMap.entrySet()){
			System.out.println("key:"+entry.getKey()+"value:"+entry.getValue().stream().map(Apple::getColor).collect(Collectors.joining(",")));
		}
	}

}
