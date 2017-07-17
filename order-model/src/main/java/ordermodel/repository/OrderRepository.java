package ordermodel.repository;

import ordermodel.domain.Order;

import java.util.*;

/**
 * @author Bhuwan Upadhyay
 */
public class OrderRepository {

    private Map<String, Order> orderMap = new HashMap<>();

    public void add(Order order) {
        orderMap.put(UUID.randomUUID().toString(), order);
    }

    public List<Order> list() {
        return new ArrayList<>(orderMap.values());
    }

}
