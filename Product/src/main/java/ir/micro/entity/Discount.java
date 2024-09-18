package ir.micro.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Discount {
    private Long id;
    private String couponName;
    private BigDecimal coupon;
    private String expiryDate;
}
