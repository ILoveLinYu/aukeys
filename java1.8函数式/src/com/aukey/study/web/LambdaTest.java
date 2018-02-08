package com.aukey.study.web;

import java.util.stream.Stream;
/**
 * reduce�Ļ����÷�
 * @author zzj
 *
 */
public class LambdaTest {

    public static void main(String[] args) {
        // �൱��foreach�����������ֵ
        Integer out = Stream.of(10, 5, 3, 2, 1, 0).reduce((result, item) -> {
            if (item >= 3) {
                result = result + item;
            }
            return result;
        }).get();
        System.out.println(out);

        // �൱�ڸ�����ʼ���ֵ��foreach�����������ֵ
        Integer sum = Stream.of(10, 5, 3, 2, 1, 0).reduce(9, LambdaTest::sumTest);
        System.out.println(sum);

        //�൱�ڸ�����ʼ���ֵ������foreach�����������ֵ
        int str = Stream.of(1,2,3).parallel().reduce(2, (result, item) -> {
        	System.out.println("xxxxxxxxxxxxxxxxxxxx:"+result+"--"+item);
            return result + item;
        } , (result, item) -> {
            //ע��ֻ�в���parallel�²Ż����˷���
        	System.out.println("yyyyyyyyyyyyyyyyyy:"+result+"--"+item);
            return result + item ;
        });
        System.out.println(str);
    }

    //�滻Integer::sum����
    public static Integer sumTest(int a1, int a2) {
        return a1 + a2;
    }

}
