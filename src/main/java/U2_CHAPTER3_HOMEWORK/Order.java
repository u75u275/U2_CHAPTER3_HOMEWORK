package U2_CHAPTER3_HOMEWORK;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Order {
    // Класс продукт см.ниже
    @Valid @NotNull
    private Product product;

    // Количество товара
    //    не может быть пустым,не должен быть меньше 1 и более 7
    @NotNull @Min(1) @Max(7)
    private int count;

    //Комментарий к заказу
    private String comment;

    public Order(Product product,
                 int count,
                 String comment) {
        this.product = product;
        this.comment = comment;
        this.count = count;
    }
}

