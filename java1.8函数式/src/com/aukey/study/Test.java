package com.aukey.study;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
public class Test {
	
	public static void main(String[] args) {
//		List<Apple> initList=new ArrayList<Apple>();
//		Apple a1=new Apple();
//		a1.setColor("红色");
//		a1.setWeight(25);
//		initList.add(a1);
//		Apple a2=new Apple();
//		a2.setColor("绿色");
//		a2.setWeight(28);
//		initList.add(a2);
//		Apple a3=new Apple();
//		a2.setColor("黄色");
//		a2.setWeight(2);
//		initList.add(a3);
//		Apple a4=new Apple();
//		a2.setColor("金色");
//		a2.setWeight(8);
//		initList.add(a4);
		//String str="1,2,3,4";
		//List<String> strList=Arrays.asList(str.split(","));
		//List<Apple> resultList=new ArrayList<Apple>();
		//List<String> colorList=new ArrayList<String>();
		//循环一个list或者其他拿你要的值放到一个新的集合
		//colorList=initList.parallelStream().filter((Apple a)-> a.getWeight()>26.00).map(Apple::getColor).collect(toList());
		//System.out.println(colorList.size());
	//Apple app=	initList.stream().max(Comparator.comparing((Apple a) -> a.getWeight())).get();
	//System.out.println(app.getWeight());
		//匿名线程
		//Thread t=new Thread(() -> System.out.println("Hello world"));
		//t.start();
		//Integer a=19;
		//Integer b=16;
		//大于则返回1，否则就返回-1
	    //System.out.println(a.compareTo(b));
		/*
		int y=0;
		long startTime = System.currentTimeMillis();
		for(int i=0;i<=10000;i++){
			for(int k=0;k<=10000;k++){
				y +=1;
			}
		}
		long endTime = System.currentTimeMillis();
	    System.out.println((endTime-startTime)/1000+"秒");
	    System.out.println(y);*/
		//Calendar cal=Calendar.getInstance();
		//cal.set(2016, 12, 31, 18, 30);
		//cal.add(Calendar.DATE, 1);
		
		//System.out.println(cal.getTime());
		//Map<String,Object> map=new HashMap<String,Object>();
		/*Map<String,Object> map=new TreeMap<String,Object>();
		map.put("a", "1");  
		map.put("b", "2");  
		map.put("d", "4");  
		map.put("c", "3");  
		for(Map.Entry<String, Object> entry:map.entrySet()){
			System.out.println(entry.getKey()+"----"+entry.getValue());
		}*/
		Apple a1=new Apple();
		a1.setColor("黄色");
		//a1.setWeight(25);
		Apple a2=new Apple();
		Map<String,Object> map=new TreeMap<String,Object>();
		for(int i=0;i<=10000;i++){
			map.put(i+"", i);
		}
		for(Entry<String, Object> entry:map.entrySet()){
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
	}

}																																			
																											
