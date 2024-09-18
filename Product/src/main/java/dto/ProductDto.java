package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
public class ProductDto {
    private String id;
    private String name;
    private String couponCode;
    private String description;
    private BigDecimal price;
}
