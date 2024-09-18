package ir.micro.service;

import ir.micro.dto.DiscountDto;
import ir.micro.entity.Discount;

public interface IDiscountService {

    void createDiscount(DiscountDto discountDto);

    Discount findDiscountByCouponName(String name);
}
