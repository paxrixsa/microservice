package ir.micro.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class DiscountDto {
    private String couponName;
    private BigDecimal coupon;
    private String expiryDate;
}
