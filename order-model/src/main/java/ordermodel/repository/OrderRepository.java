package ordermodel.repository;

import ordermodel.domain.Order;

import java.util.*;

/**
 * @author Bhuwan Upadhyay
 */
public class OrderRepository {

    private Map<String, Order> orderMap = new HashMap<>();

    public String add(Order order) {
        String key = UUID.randomUUID().toString();
        orderMap.put(key, order);
        return key;
    }

    public List<Order> list() {
        return new ArrayList<>(orderMap.values());
    }

    public void update(String key, Order updatedOrder) {
        orderMap.put(key, updatedOrder);
    }

    public Order findById(String orderId) {
        return orderMap.get(orderId);
    }
}
