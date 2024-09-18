package ir.micro.service;

import ir.micro.dto.DiscountDto;
import ir.micro.entity.Discount;
import ir.micro.repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountServiceImpl implements IDiscountService {

    @Autowired
    private DiscountRepository discountRepository;

    @Override
    public void createDiscount(DiscountDto discountDto) {
        discountRepository.save(dtoToEntity(discountDto));
    }

    @Override
    public Discount findDiscountByCouponName(String name) {
        return discountRepository.findDiscountByCouponName(name);
    }

    private Discount dtoToEntity(DiscountDto discountDto) {
        Discount discount = new Discount();
        discount.setCoupon(discountDto.getCoupon());
        discount.setCouponName(discountDto.getCouponName());
        discount.setExpiryDate(discountDto.getExpiryDate());
        return discount;
    }

    private DiscountDto entityToDto(Discount discount) {
        DiscountDto discountDto = new DiscountDto();
        discountDto.setCoupon(discount.getCoupon());
        discountDto.setCouponName(discount.getCouponName());
        discountDto.setExpiryDate(discount.getExpiryDate());
        return discountDto;
    }
}
