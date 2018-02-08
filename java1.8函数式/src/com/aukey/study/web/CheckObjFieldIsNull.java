package com.aukey.study.web;

import java.lang.reflect.Field;

import com.aukey.study.Apple;

/**
 * 检查对象以及对象里的属性是否有空值
 * 
 * @author zzj
 *
 */
public class CheckObjFieldIsNull {
	public static void main(String[] args) throws IllegalAccessException {
		Apple a = new Apple();
		System.out.println(checkObjFieldIsNull(a));
	}

	public static String checkObjFieldIsNull(Object obj) throws IllegalAccessException {
		String result = "";
		
		boolean flag = false;
		if (obj == null) {
			flag = true;
			result = "对象为空";
		} else {
			for (Field f : obj.getClass().getDeclaredFields()) {
				f.setAccessible(true);
				if (f.get(obj) == null) {
					flag = true;
					result += f.getName() + ":为空;";
				}
			}
		}
		return flag ? result : "1";
	}
}
