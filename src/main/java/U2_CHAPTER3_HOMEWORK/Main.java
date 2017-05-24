package U2_CHAPTER3_HOMEWORK;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws ParseException {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        Validator validator = vf.getValidator();

        String creationDate = "10.02.2012";
        String expirationDate = "10.02.2010";

        Product iphone = new Product("Iphone",
                new BigDecimal(0.01),
                (new SimpleDateFormat("dd.mm.yyyy")).parse(creationDate),
                (new SimpleDateFormat("dd.mm.yyyy")).parse(expirationDate)
                );

        Order order = new Order(iphone, 2, "Самый лучший телефон");

        Set<ConstraintViolation<Order>> validate = validator.validate(order);


        System.out.println(":::: validate = " + validate.size());
        for (ConstraintViolation<Order> s : validate) {
            System.out.println(s);
        }
        vf.close();
    }
}

