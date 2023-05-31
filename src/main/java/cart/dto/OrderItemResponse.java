package cart.dto;

import cart.domain.OrderItem;

public class OrderItemResponse {
    
    private Long id;
    private int quantity;
    private ProductResponse productResponse;
    
    public OrderItemResponse(Long id, int quantity, ProductResponse productResponse) {
        this.id = id;
        this.quantity = quantity;
        this.productResponse = productResponse;
    }
    
    public static OrderItemResponse of(OrderItem orderItem) {
        return new OrderItemResponse(orderItem.getId(), orderItem.getQuantity(),
                ProductResponse.of(orderItem.getProduct()));
    }
    
    public Long getId() {
        return id;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public ProductResponse getProductResponse() {
        return productResponse;
    }
}
