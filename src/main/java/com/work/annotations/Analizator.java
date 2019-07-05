package com.work.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Analizator {
    public void run(Class<?> aClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object object = aClass.newInstance();
        Method[] decMethods = aClass.getDeclaredMethods();
        for (Method method : decMethods) {
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                if(parameter.isAnnotationPresent(CheckBrackets.class)){
                    method.invoke(object, "hello");
                    System.out.println(parameter.getName());
                    System.out.println(parameter.toString());
                }
            }
        }

    }
}
