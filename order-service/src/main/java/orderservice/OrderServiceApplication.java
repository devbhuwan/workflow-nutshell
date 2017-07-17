package orderservice;

import io.github.devbhuwan.workflow.model.contracts.WorkflowProcessService;
import ordermodel.repository.OrderRepository;
import ordermodel.service.OrderApiService;
import ordermodel.usecases.PlaceNewOrderUsecase;
import ordermodel.usecases.ValidateOrderUsecase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/07/15
 */
@SpringBootApplication
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @Bean
    public OrderRepository orderRepository() {
        return new OrderRepository();
    }

    @Bean
    public ValidateOrderUsecase validateOrderUsecase() {
        return new ValidateOrderUsecase();
    }

    @Bean
    public PlaceNewOrderUsecase placeNewOrderUsecase(OrderRepository orderRepository, ValidateOrderUsecase validateOrderUsecase, WorkflowProcessService workflowProcessService) {
        PlaceNewOrderUsecase placeNewOrderUsecase = new PlaceNewOrderUsecase();
        placeNewOrderUsecase.setOrderRepository(orderRepository);
        placeNewOrderUsecase.setValidateOrderUsecase(validateOrderUsecase);
        //placeNewOrderUsecase.setWorkflowProcessService(workflowProcessService);
        return placeNewOrderUsecase;
    }

    @Bean
    public OrderApiService orderApiService(PlaceNewOrderUsecase placeNewOrderUsecase) {
        OrderApiService orderApiService = new OrderApiService();
        orderApiService.setPlaceNewOrderUsecase(placeNewOrderUsecase);
        return orderApiService;
    }

}
