package orderservice.tasks;

import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

/**
 * @author Bhuwan Upadhyay
 */
@Slf4j
public class ChefApproveTask implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        log.info("Approved");
    }

}
