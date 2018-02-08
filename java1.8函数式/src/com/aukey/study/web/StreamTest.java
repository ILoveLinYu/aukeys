package com.aukey.study.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.aukey.study.Apple;

/**
 * java 1.8һЩ��ͨ������ʹ��
 * 
 * @author zzj
 *
 */
public class StreamTest {
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
		a4.setColor("gggg");
		a4.setWeight(10.2);
		list.add(a4);
		// ���򷽷�
		Collections.sort(list, Comparator.comparing(Apple::getWeight));
		list.stream().map(Apple::getWeight).forEach(System.out::println);
		// peek���������Ѻ���������������Զ��������ֵ�����޸�
		List<Apple> doubleList = list.stream().filter(a -> a != null && a.getWeight().doubleValue() > 2.00).peek(x -> {
			x.setWeight(562.00);
		}).collect(Collectors.toList());

		doubleList.stream().map(Apple::getWeight).forEach(System.out::println);
		list.stream().map(Apple::getWeight).forEach(System.out::println);
		//sum()��ͷ���
		double sum=list.stream().mapToDouble(Apple::getWeight).sum();
		System.out.println(sum);
		//count()ͳ�Ƹ�������,limit()ȡ��ǰ����
		double count=list.stream().limit(1).count();
		System.out.println(count);
		//distinct()ȥ�ط���
		List<String> colorList=Arrays.asList("blue","yellow","blue","red");
		colorList.stream().distinct().forEach(System.out::println);
		//skip: ����һ������ԭStream��ǰN��Ԫ�غ�ʣ��Ԫ����ɵ���Stream�����ԭStream�а�����Ԫ�ظ���С��N����ô���ؿ�Stream��
		colorList.stream().skip(2).forEach(System.out::println);
		//reduce����
		int value = Stream.of(1, 2, 3, 4).reduce(100, Integer::sum);
		System.out.println(value);
		String colorAry=colorList.stream().collect(Collectors.joining(","));
		System.out.println(colorAry);
		DoubleSummaryStatistics dss = list.stream().collect(Collectors.summarizingDouble((Apple p)->p.getWeight()));
		double average=dss.getAverage();
		double max=dss.getMax();
		double min=dss.getMin();
		double sum2=dss.getSum();
		double count2=dss.getCount();
		System.out.println("average:"+average+"---max:"+max+"---min:"+min+"---sum2:"+sum2+"---count2:"+count2);
	}
}
