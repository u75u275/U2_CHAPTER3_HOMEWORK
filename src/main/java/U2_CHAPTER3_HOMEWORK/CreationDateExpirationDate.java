package U2_CHAPTER3_HOMEWORK;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Constraint(validatedBy = {CreationDateExpirationDateValidator.class})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE})
@Retention(RUNTIME)
public @interface CreationDateExpirationDate {
    String message() default "{U2_CHAPTER3_HOMEWORK.message1}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
