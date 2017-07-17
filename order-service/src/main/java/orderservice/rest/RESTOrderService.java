package orderservice.rest;

import ordermodel.domain.Order;
import ordermodel.service.OrderApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author Bhuwan Upadhyay
 */
@RestController
@RequestMapping(value = "orders")
public class RESTOrderService {

    @Autowired
    private OrderApiService orderApiService;

    @GetMapping
    public List<Order> listAll() {
        return orderApiService.listOrders();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void placeNewOrder(@RequestBody Order order) {
        orderApiService.placeNewOrder(order);
    }

}
