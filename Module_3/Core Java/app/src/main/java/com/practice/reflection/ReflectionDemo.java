package com.practice.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 39. Reflection in Java
 * Uses reflection to inspect class metadata and invoke methods.
 */
public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.practice.reflection.SampleClass");
            System.out.println("Class name: " + clazz.getName());

            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            System.out.println("Declared constructors:");
            for (Constructor<?> constructor : constructors) {
                System.out.println(" - " + constructor);
            }

            Field[] fields = clazz.getDeclaredFields();
            System.out.println("Declared fields:");
            for (Field field : fields) {
                System.out.println(" - " + field.getType().getSimpleName() + " " + field.getName());
            }

            Method[] methods = clazz.getDeclaredMethods();
            System.out.println("Declared methods:");
            for (Method method : methods) {
                System.out.println(" - " + method.getReturnType().getSimpleName() + " " + method.getName());
            }

            var sample = clazz.getConstructor(String.class, int.class).newInstance("ReflectionTest", 5);
            Method greet = clazz.getMethod("greet");
            greet.invoke(sample);
            Method multiply = clazz.getMethod("multiply", int.class);
            Object result = multiply.invoke(sample, 3);
            System.out.println("multiply(3) result: " + result);
        } catch (Exception e) {
            System.err.println("Reflection failed: " + e.getMessage());
        }
    }
}
