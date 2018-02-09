package com.aukey.study.utils;

import java.util.ArrayList;
import java.util.List;

import com.aukey.study.Apple;

/**
 * 创建list的工具
 * @author zzj
 *
 */
public class Lists {
	public static List<Apple> newArrayList(Apple a) {
		List<Apple> list=new ArrayList<Apple>();
		list.add(a);
	    return list;
	}
}
