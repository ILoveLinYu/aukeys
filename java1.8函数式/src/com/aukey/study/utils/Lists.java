package com.aukey.study.utils;

import java.util.ArrayList;
import java.util.List;

import com.aukey.study.Apple;

/**
 * ����list�Ĺ���
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
