package com.anc;

import java.lang.annotation.*;

/**
 * Created by AAbraham on 10/11/2015.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassAnnotation {
    String testClassName();
    String category();
}
