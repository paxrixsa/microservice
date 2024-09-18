package ir.micro.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class ProductRequestDto {
    private String name;
    private String couponCode;
    private String description;
    private BigDecimal price;
}
