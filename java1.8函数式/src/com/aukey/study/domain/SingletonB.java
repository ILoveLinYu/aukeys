package com.aukey.study.domain;

/** 
 * Created by jack on 2017/8/1. 
 * ����������ģʽ 
 */  
public class SingletonB {  
    private static SingletonB singletonB = null;  
  
    private SingletonB() {  
    }  
  
    public static SingletonB getSingletonB() {  
        if (singletonB == null) {  
            synchronized (SingletonB.class) {  
                if (singletonB == null) {  
                    singletonB = new SingletonB();  
                }  
            }  
        }  
        return singletonB;  
    }  
}
