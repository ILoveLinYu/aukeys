package com.aukey.study;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;


public class ComparatorTest {

	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		List<Apple> list=new ArrayList<Apple>();
		Apple a1=new Apple();
		a1.setColor("红色");
		a1.setWeight(1.00);
		list.add(a1);
		Apple a2=new Apple();
		a2.setColor("红色");
		a2.setWeight(1.00);
		list.add(a2);
		Apple a3=new Apple();
		a3.setColor("红色");
		a3.setWeight(1.00);
		list.add(a3);
		Apple a4=new Apple();
		a4.setColor("gggg");
//		a4.setWeight(10.2);
		/* Collections.sort(list, Comparator.comparing(Apple::getWeight)); 
		 for(Apple a:list){
			 System.out.println(a.getWeight()); 
		 }*/
		//list.stream().map(Apple::getWeight).collect(Collectors.toList());
		//Optional<Apple> name =Optional.ofNullable(a4);	
		//System.out.println(name.isPresent());
		
		
		/*Optional.ofNullable(a4).ifPresent(x -> {
			System.out.println(x.getColor()+"--"+x.getWeight()+"--");
		});*/
		//System.out.println(checkObjFieldIsNull(a4));
	List<Apple> doubleList=list.stream().peek(x -> {
			x.setWeight(562.00);
			System.out.println(x.getWeight());
		}).collect(Collectors.toList());
	
	for(Apple x:list){
		x.setWeight(562.00);
	}
	
	doubleList.stream().peek(x -> {
		System.out.println(x.getWeight());
	}).collect(Collectors.toList());
	}
	public static String checkObjFieldIsNull(Object obj) throws IllegalAccessException {
        String result="";
	    boolean flag = false;
	    if(obj==null){
	    	flag = true;
	    	result="对象为空";
	    }else{
	    	for(Field f : obj.getClass().getDeclaredFields()){
		        f.setAccessible(true);
		        if(f.get(obj) == null){
		            flag = true;
		            result +=f.getName()+":为空;";
		        }
		    }
	    }
	    return flag?result:"1";
	}

}
