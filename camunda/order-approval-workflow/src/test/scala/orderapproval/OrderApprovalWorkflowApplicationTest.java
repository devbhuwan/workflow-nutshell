package orderapproval;

import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.spring.boot.starter.property.CamundaBpmProperties;
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
@SpringBootTest(classes = {OrderApprovalWorkflowApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrderApprovalWorkflowApplicationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private CamundaBpmProperties camundaBpmProperties;

    @Autowired
    private RepositoryService repositoryService;

    @Test
    public void approveOrder() {

    }
}