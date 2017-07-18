package ordermodel.usecases;


import io.github.devbhuwan.workflow.model.contracts.WorkflowProcessService;
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
    @Setter
    private WorkflowProcessService workflowProcessService;

    public List<String> newOrder(Order newOrder) {
        List<String> list = validateOrderUsecase.validate(newOrder);
        if (list.isEmpty()) {
            newOrder.setState("CREATED");
            orderRepository.add(newOrder);
            workflowProcessService.startProcess("WF_Order", null);
        }
        return list;
    }
}
