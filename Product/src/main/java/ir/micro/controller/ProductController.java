package ir.micro.controller;

import ir.micro.dto.ProductRequestDto;
import ir.micro.entity.Product;
import ir.micro.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    @PostMapping("/create")
    public Product createProduct(@RequestBody ProductRequestDto productRequestDto) {
        return productService.create(productRequestDto);
    }
}
