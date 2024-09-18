package ir.micro.repository;

import ir.micro.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Long> {

    Discount findDiscountByCouponName(String name);
}
