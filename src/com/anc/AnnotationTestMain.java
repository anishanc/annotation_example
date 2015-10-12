package com.anc;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by AAbraham on 10/12/2015.
 */
public class AnnotationTestMain {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<TestClassUsingAnnotation> obj = TestClassUsingAnnotation.class;

        if (obj.isAnnotationPresent(ClassAnnotation.class)) {

            Annotation annotation = obj.getAnnotation(ClassAnnotation.class);

            ClassAnnotation classAnnotation = (ClassAnnotation)annotation;
            System.out.println("CAT  :  " + classAnnotation.category());
            System.out.println("NAME  :  " + classAnnotation.testClassName());

        }


        for (Method method : obj.getDeclaredMethods()) {
            if ( method.isAnnotationPresent(MethodAnnotation.class)) {
                Annotation annotation = method.getAnnotation(MethodAnnotation.class);

                MethodAnnotation methodAnnotation = (MethodAnnotation) annotation;
                if (methodAnnotation.enabled()) {
                    try {
                        method.invoke(obj.newInstance());
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
