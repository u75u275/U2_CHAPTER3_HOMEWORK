package U2_CHAPTER3_HOMEWORK;


import javax.validation.constraints.Future;
import java.math.BigDecimal;
import java.util.Date;


// Class-Level Constraint

@CreationDateExpirationDate
public class Product {
    // Имя продукта
    private String name;

    // Цена продукта
    private BigDecimal price;

    //Дата создания продукта
    private Date creationDate;

    //Срок годности
    @Future
    private Date expirationDate;

    public Product(String name,
                   BigDecimal price,
                   Date creationDate,
                   Date expirationDate) {
        this.name = name;
        this.price = price;
        this.creationDate = creationDate;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
