package U2_CHAPTER3_HOMEWORK;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class CreationDateExpirationDateValidator implements ConstraintValidator<CreationDateExpirationDate,Product> {

    public void initialize(CreationDateExpirationDate var1){}

    public boolean isValid (Product var1, ConstraintValidatorContext var2){
        return var1.getCreationDate().getTime() < var1.getExpirationDate().getTime();}

}
