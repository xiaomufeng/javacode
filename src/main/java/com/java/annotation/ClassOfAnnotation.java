/*
 * Copyright 2016 alibaba.com All right reserved. This software is the
 * confidential and proprietary information of alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with alibaba.com.
 */
package com.java.annotation;



/**
 * 类ClassOfAnnotation.java的实现描述：TODO 类实现描述 
 * @author macun 2016年7月14日 上午10:58:07
 */
public class ClassOfAnnotation {

    @Permission(value = { PermOperation.GOODSPRICE })
    public void print1(){
        System.out.println("print1");
    }
    
}
