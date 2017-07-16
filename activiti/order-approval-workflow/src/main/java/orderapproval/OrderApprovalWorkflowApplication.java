package orderapproval;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/07/15
 */
@SpringBootApplication
@EnableProcessApplication
public class OrderApprovalWorkflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApprovalWorkflowApplication.class, args);
    }

}
