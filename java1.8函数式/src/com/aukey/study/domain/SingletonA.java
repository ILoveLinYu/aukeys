package com.aukey.study.domain;
/**
 * ����ģ�飬����ģʽ
 * @author zzj
 *
 */
public class SingletonA {
         /**
          * ������������
          */
	private static SingletonA singletonA=new SingletonA();
	/**
	 * ���캯��˽�л����������������洴������
	 */
	private SingletonA(){}
	/**
	 * ��ȡ��������
	 */
	public static SingletonA getSingletonA(){
		return singletonA;
	}
}
