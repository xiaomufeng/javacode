package com.java.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Vector;

/**
 * 类MainTest.java的实现描述：TODO 类实现描述
 * 
 * @author macun 2016年7月14日 上午10:56:08
 */
public class MainTest {

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        ClassOfAnnotation annotation1 = new ClassOfAnnotation();
        Long lo = new Long(1L);
        
        Field field = ClassLoader.class.getDeclaredField("classes");
        field.setAccessible(true);
        Vector<Class> classes = (Vector<Class>) field.get(MainTest.class.getClassLoader());
        Class[] a = new Class[classes.size()];
        classes.toArray(a);
        
        for (Class cl : a) {
            System.out.println(cl.getName());
            Method[] ms = cl.getDeclaredMethods();
            for (Method m : ms) {
                if(null != m.getAnnotation(Permission.class)){
                    Permission permission = m.getAnnotation(Permission.class);
                    PermOperation[] perms =permission.value();
                    for(PermOperation perm:perms){
                        System.out.println(perm.getDesc());
                    }
                    
                    System.out.println(m.getName());
                }
                
            }
            
        }
        
    }
}
