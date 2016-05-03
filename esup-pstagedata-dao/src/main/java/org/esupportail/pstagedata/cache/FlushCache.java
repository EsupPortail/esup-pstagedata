package org.esupportail.pstagedata.cache;

import java.lang.annotation.*;

/**
 * Created by Ostrowski on 02/05/2016.
 */
@Target(ElementType.METHOD) @Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface FlushCache {
    Cache[] value() default Cache.ALL;
}

