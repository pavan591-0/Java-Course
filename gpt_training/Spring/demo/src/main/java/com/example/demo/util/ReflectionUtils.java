package com.example.demo.util;

import java.lang.reflect.Field;

public class ReflectionUtils {

    public static Object getFeildValue(Object obj, String fieldName){
        try{
            Field field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(obj);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Invalid Field "+fieldName);
        }
    }

}
