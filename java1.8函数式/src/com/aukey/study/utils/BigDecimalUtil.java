package com.aukey.study.utils;

import java.math.BigDecimal;

public class BigDecimalUtil {
	/** 
     * 提供精确加法计算的add方法 
     * @param value1 被加�? 
     * @param value2 加数 
     * @return 两个参数的和 
     */  
    public static double add(double value1,double value2){  
        BigDecimal b1 = new BigDecimal(Double.toString(value1));  
        BigDecimal b2 = new BigDecimal(Double.toString(value2));  
        return b1.add(b2).doubleValue();  
    }  
      
    /** 
     * 提供精确减法运算的sub方法 
     * @param value1 被减�? 
     * @param value2 减数 
     * @return 两个参数的差 
     */  
    public static double sub(double value1,double value2,int scale) {  
        BigDecimal b1 = new BigDecimal(Double.toString(value1));  
        BigDecimal b2 = new BigDecimal(Double.toString(value2));  
        return b1.subtract(b2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();  
    }  
      
    /** 
     * 提供保留位数乘法运算的mul方法 
     * @param value1 被乘�? 
     * @param value2 乘数 
     * @param scale 精确范围 
     * @return 两个参数的积 
     */  
    public static double mul(double value1,double value2,int scale){  
    	
        BigDecimal b1 = new BigDecimal(Double.toString(value1));  
        BigDecimal b2 = new BigDecimal(Double.toString(value2));  
        return b1.multiply(b2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();  
    }  
      
    /** 
     * 提供精确的除法运算方法div 
     * @param value1 被除�? 
     * @param value2 除数 
     * @param scale 精确范围 
     * @return 两个参数的商 
     * @throws IllegalAccessException 
     */  
    public static double div(double value1,double value2,int scale) throws IllegalAccessException{  
        //如果精确范围小于0，抛出异常信�?  
        if(scale<0){           
            throw new IllegalAccessException("精确度不能小�?0");  
        }  
        BigDecimal b1 = new BigDecimal(Double.toString(value1));  
        BigDecimal b2 = new BigDecimal(Double.toString(value2));  
        return b1.divide(b2,BigDecimal.ROUND_HALF_UP).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();      
    }  
}
