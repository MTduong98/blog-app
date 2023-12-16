package com.vti.blogapp.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(
        validatedBy = PostTitleNotExistsValidator.class
)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface PostTitleNotExists {
    String message() default "{post.title.NotExists.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
