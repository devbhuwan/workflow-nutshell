package orderservice.rest

import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

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

}
