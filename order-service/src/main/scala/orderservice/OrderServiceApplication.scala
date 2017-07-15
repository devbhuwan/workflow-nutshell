package orderservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
  * @author Bhuwan Upadhyay
  * @date 2017/07/15
  */
@SpringBootApplication
class OrderServiceApplication {

}

object Application extends App {
  SpringApplication.run(classOf[OrderServiceApplication], args: _*)
}