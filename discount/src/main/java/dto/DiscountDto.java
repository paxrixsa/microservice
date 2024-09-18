package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class DiscountDto {
    private Long id;
    private String couponName;
    private BigDecimal coupon;
    private String expiryDate;
}
