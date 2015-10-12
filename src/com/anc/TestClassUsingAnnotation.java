package com.anc;

@ClassAnnotation(category = "my_custom", testClassName = "my_class")
public class TestClassUsingAnnotation {

    @MethodAnnotation(enabled = true)
    public void checkAllStatus() {
        System.out.println( "Inside the check all status method");
    }
}
