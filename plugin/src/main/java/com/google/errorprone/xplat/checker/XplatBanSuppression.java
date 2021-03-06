package com.google.errorprone.xplat.checker;


import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Annotation to suppress errors generated by {@link XplatBans}. */
@Retention(RetentionPolicy.SOURCE)
@Target({CONSTRUCTOR, METHOD, PARAMETER, FIELD, LOCAL_VARIABLE, TYPE})
public @interface XplatBanSuppression {

  /**
   * Allows for this annotation to be self-documenting by adding a comment inside it. For example,
   * {@code @XplatBanSuppression("This Joda-Time code wil not be used on the web.")}
   */
  String value() default "";
}
