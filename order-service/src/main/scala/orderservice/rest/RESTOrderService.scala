package orderservice.rest

import orderservice.model.OrderDTO
import org.springframework.web.bind.annotation.{GetMapping, RequestBody, RequestMapping, RestController}

/**
  * @author Bhuwan Upadhyay
  * @date 2017/07/15
  */
@RestController
@RequestMapping(value = Array("orders"))
class RESTOrderService {

  @GetMapping
  def greeting(): String = {
    "greeting"
  }

  def newOrder(@RequestBody order: OrderDTO): Unit = {

  }

}
