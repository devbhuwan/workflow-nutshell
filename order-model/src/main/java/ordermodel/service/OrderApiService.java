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

    public Order findOrder(String orderId) {
        return orderRepository.findById(orderId);
    }

    public Order saveOrder(Order order){
        return order;
    }
    public Order terminate(Order order){
        return order;
    }
}
