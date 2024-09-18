package entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collation = "product")
public class Product {
    private String id;
    private String name;
    private String couponCode;
    private String description;
    private BigDecimal price;
}
