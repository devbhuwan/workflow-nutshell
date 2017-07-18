package orderservice.rest;

import io.github.devbhuwan.workflow.model.contracts.Operation;
import io.github.devbhuwan.workflow.model.contracts.WorkflowProcessInfo;
import io.github.devbhuwan.workflow.model.contracts.WorkflowProcessService;
import ordermodel.domain.Order;
import ordermodel.service.OrderApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Bhuwan Upadhyay
 */
@RestController
@RequestMapping(value = "orders")
public class RESTOrderService {

    public static final String ARG_DTO = "ARG_DTO";

    @Autowired
    private WorkflowProcessService workflowProcessService;
    @Autowired
    private OrderApiService orderApiService;

    @GetMapping
    public List<Order> listAll() {
        return orderApiService.listOrders();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void placeNewOrder(@RequestBody Order order) {
        WorkflowProcessInfo workflowProcessInfo = workflowProcessService.startProcess("", null);
        order.setState("CREATED");
        order.setProcessInstanceId(workflowProcessInfo.processInstanceId());
        orderApiService.placeNewOrder(order);
    }

    @PostMapping("/execute")
    @ResponseStatus(HttpStatus.OK)
    public void task(@RequestBody Operation operation, String orderId) {
        Order order = orderApiService.findOrder(orderId);
        Map<String, Object> variables = new HashMap<>();
        variables.put(ARG_DTO, order);
        workflowProcessService.executeTask(operation, variables);
    }

}
