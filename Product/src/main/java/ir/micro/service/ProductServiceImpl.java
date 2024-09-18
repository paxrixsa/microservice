package ir.micro.service;

import ir.micro.dto.ProductRequestDto;
import ir.micro.entity.Discount;
import ir.micro.entity.Product;
import ir.micro.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Product create(ProductRequestDto productRequestDto) {
        Discount discount = restTemplate.getForObject("http://localhost:9090/api/v1/discounts/{couponName}", Discount.class, productRequestDto.getCouponCode());
        BigDecimal subtract = new BigDecimal("100").subtract(discount.getCoupon());
        productRequestDto.setPrice(subtract.multiply(productRequestDto.getPrice()).divide(new BigDecimal("100")));
        return productRepository.save(dtoToEntity(productRequestDto));
    }

    private Product dtoToEntity(ProductRequestDto productRequestDto) {
        Product product = new Product();
        product.setName(productRequestDto.getName());
        product.setPrice(productRequestDto.getPrice());
        product.setCouponCode(productRequestDto.getCouponCode());
        product.setDescription(productRequestDto.getDescription());
        return product;
    }
}
