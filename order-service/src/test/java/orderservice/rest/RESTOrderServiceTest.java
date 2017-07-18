package orderservice.rest;

import io.github.devbhuwan.workflow.model.contracts.ImmutableOperationSearchQuery;
import io.github.devbhuwan.workflow.model.contracts.OperationRole;
import io.github.devbhuwan.workflow.model.contracts.WorkflowProcessInfo;
import io.github.devbhuwan.workflow.model.contracts.WorkflowProcessService;
import ordermodel.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Bhuwan Upadhyay
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RESTOrderServiceTest {

    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private WorkflowProcessService workflowProcessService;

    @Test
    public void placeNewOrder() {
//        Assertions.assertThat(restTemplate.postForEntity("/orders", buildOrder(), Void.class))
//                .is(new Join<ResponseEntity<Void>>() {
//                    @Override
//                    public boolean matches(ResponseEntity<Void> value) {
//                        return value.getStatusCode().is2xxSuccessful();
//                    }
//                });
        WorkflowProcessInfo processInfo = workflowProcessService.startProcess("WF_Order", null);
        workflowProcessService.operations(ImmutableOperationSearchQuery.builder()
                .processInstanceId(processInfo.processInstanceId())
                .userId("")
                .userRole(OperationRole.CHECKER)
                .build());
    }

    private Order buildOrder() {
        return new Order();
    }
}