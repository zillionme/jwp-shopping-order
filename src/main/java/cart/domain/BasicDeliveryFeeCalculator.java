package cart.domain;

import org.springframework.stereotype.Component;

@Component
public class BasicDeliveryFeeCalculator implements DeliveryFeeCalculator{
    
    public static int BASIC_FEE = 3000;
    
    @Override
    public int calculate(Member member, OrderItems itemsToOrder) {
        int totalPrice = itemsToOrder.getTotalPrice();
        if(totalPrice > 50000) {
            return 0;
        }
        return BASIC_FEE;
    }
}
