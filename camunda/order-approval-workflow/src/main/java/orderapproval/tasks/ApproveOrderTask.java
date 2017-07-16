package orderapproval.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

/**
 * @author Bhuwan Upadhyay
 */
@Component
public class ApproveOrderTask implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {

    }

}
