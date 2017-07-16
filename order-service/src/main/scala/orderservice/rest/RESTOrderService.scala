package orderservice.rest

import java.util.UUID

import orderservice.model.Order
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation._

import scala.collection.mutable

/**
  * @author Bhuwan Upadhyay
  *
  */
@RestController
@RequestMapping(value = Array("orders"))
class RESTOrderService {

  val orderMap = new mutable.HashMap[String, Order]()

  @GetMapping
  def greeting(): List[Order] = orderMap.valuesIterator.toList

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  def newOrder(@RequestBody order: Order): Unit = {
    orderMap.put(UUID.randomUUID().toString, order)
  }

}
