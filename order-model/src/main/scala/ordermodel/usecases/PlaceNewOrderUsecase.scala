package ordermodel.usecases

import io.github.devbhuwan.workflow.model.contracts.WorkflowProcessService
import ordermodel.domain.Order
import ordermodel.repository.OrderRepository

import scala.beans.BeanProperty

/**
  * @author Bhuwan Upadhyay
  *
  */
class PlaceNewOrderUsecase {

  @BeanProperty
  var orderRepository: OrderRepository = _
  @BeanProperty
  var validateOrderUsecase: ValidateOrderUsecase = _
  @BeanProperty
  var workflowProcessService: WorkflowProcessService = _

  def newOrder(newOrder: Order): List[String] = {
    val list = validateOrderUsecase.validate(newOrder)
    if (list.isEmpty) {
      orderRepository.add(newOrder)
      workflowProcessService.initProcess();
    }
    list
  }
}
