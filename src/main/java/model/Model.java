package model;

import java.lang.annotation.*;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Model {
    String[] transientFields() default {};
}
