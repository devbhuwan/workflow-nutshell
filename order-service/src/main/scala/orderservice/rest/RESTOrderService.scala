package orderservice.rest

import ordermodel.domain.Order
import ordermodel.service.OrderApiService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation._

import scala.collection.JavaConverters

/**
  * @author Bhuwan Upadhyay
  *
  */
@RestController
@RequestMapping(value = Array("orders"))
class RESTOrderService {

  @Autowired
  var orderApiService: OrderApiService = _

  @GetMapping
  def listAll(): java.util.Collection[Order] = {
    JavaConverters.asJavaCollection(orderApiService.listOrders())
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  def placeNewOrder(@RequestBody order: Order): Unit = {
    orderApiService.placeNewOrder(order)
  }


}
