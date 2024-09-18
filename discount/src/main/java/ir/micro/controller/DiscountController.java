package ir.micro.controller;

import ir.micro.dto.DiscountDto;
import ir.micro.entity.Discount;
import ir.micro.service.IDiscountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/discounts")
public class DiscountController {

    private final IDiscountService discountService;

    public DiscountController(IDiscountService discountService) {
        this.discountService = discountService;
    }

    @PostMapping("/create")
    public ResponseEntity<Void> createDiscount(@RequestBody DiscountDto discountDto) {
        discountService.createDiscount(discountDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{couponName}")
    public Discount getDiscount(@PathVariable("couponName") String couponName) {
        return discountService.findDiscountByCouponName(couponName);
    }
}
