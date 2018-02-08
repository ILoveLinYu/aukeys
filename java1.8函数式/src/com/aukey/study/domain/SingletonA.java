package com.aukey.study.domain;
/**
 * 单例模块，饿汉模式
 * @author zzj
 *
 */
public class SingletonA {
         /**
          * 创建单例对象
          */
	private static SingletonA singletonA=new SingletonA();
	/**
	 * 构造函数私有化，不允许在类外面创建对象
	 */
	private SingletonA(){}
	/**
	 * 获取单例对象
	 */
	public static SingletonA getSingletonA(){
		return singletonA;
	}
}
