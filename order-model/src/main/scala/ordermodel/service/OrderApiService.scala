package ordermodel.service

import ordermodel.domain.Order
import ordermodel.usecases.PlaceNewOrderUsecase

import scala.beans.BeanProperty


/**
  * @author Bhuwan Upadhyay
  *
  */
class OrderApiService {

  @BeanProperty
  var placeNewOrderUsecase: PlaceNewOrderUsecase = _

  def placeNewOrder(newOrder: Order): List[String] = {
    placeNewOrderUsecase.newOrder(newOrder)
  }

  def listOrders(): List[Order] = {
    placeNewOrderUsecase.orderRepository.list()
  }

}
