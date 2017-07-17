package ordermodel.service;

import lombok.Setter;
import ordermodel.domain.Order;
import ordermodel.repository.OrderRepository;
import ordermodel.usecases.PlaceNewOrderUsecase;

import java.util.List;


/**
 * @author Bhuwan Upadhyay
 */
public class OrderApiService {

    @Setter
    private PlaceNewOrderUsecase placeNewOrderUsecase;
    @Setter
    private OrderRepository orderRepository;

    public List<String> placeNewOrder(Order newOrder) {
        return placeNewOrderUsecase.newOrder(newOrder);
    }

    public List<Order> listOrders() {
        return orderRepository.list();
    }

}
