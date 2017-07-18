package ordermodel.usecases;


import lombok.Setter;
import ordermodel.domain.Order;
import ordermodel.repository.OrderRepository;

import java.util.List;


/**
 * @author Bhuwan Upadhyay
 */
public class PlaceNewOrderUsecase {

    @Setter
    private OrderRepository orderRepository;
    @Setter
    private ValidateOrderUsecase validateOrderUsecase;

    public List<String> newOrder(Order newOrder) {
        List<String> list = validateOrderUsecase.validate(newOrder);
        if (list.isEmpty()) {
            orderRepository.add(newOrder);
        }
        return list;
    }
}
