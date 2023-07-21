package com.spring.jpa.api.storeapi.dto.response;

import com.spring.jpa.api.storeapi.entity.Product;
import com.spring.jpa.api.storeapi.entity.ProductDetail;
import lombok.*;

@Setter @Getter @ToString
@EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@Builder
public class ProductResponseDTO {

    private Long id;
    private String productName; // 물품 이름
    private int inventoryCount; // 물품 개수

    public ProductResponseDTO(Product product) {
        this.id = product.getId();
        this.productName = product.getProductName();
        this.inventoryCount = product.getInventoryCount();
    }

}
