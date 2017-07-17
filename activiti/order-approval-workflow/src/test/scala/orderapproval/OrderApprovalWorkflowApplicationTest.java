package orderapproval;

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

    @Test
    public void name() {
    }

}