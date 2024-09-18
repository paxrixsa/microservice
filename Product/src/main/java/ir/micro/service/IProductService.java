package ir.micro.service;

import ir.micro.dto.ProductRequestDto;
import ir.micro.entity.Product;

public interface IProductService {

    Product create(ProductRequestDto productRequestDto);
}
