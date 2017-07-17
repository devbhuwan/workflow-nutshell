package ordermodel.repository

import java.util.UUID

import ordermodel.domain.Order

import scala.collection.mutable

/**
  * @author Bhuwan Upadhyay
  *
  */
class OrderRepository {

  val orderMap = new mutable.HashMap[String, Order]()

  def add(order: Order): Unit = {
    orderMap.put(UUID.randomUUID().toString, order);
  }

  def list(): List[Order] = {
    orderMap.valuesIterator.toList
  }

}
