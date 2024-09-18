package entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Table
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String couponName;

    @NonNull
    private BigDecimal coupon;

    @Column(name = "expiry_date")
    @JsonProperty("expiryDate")
    @NonNull
    private String expiryDate;
}
