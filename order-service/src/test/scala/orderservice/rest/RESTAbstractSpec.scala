package orderservice.rest

import org.scalatest._
import org.springframework.boot.test.context.SpringBootTest

/**
  * @author Bhuwan Upadhyay
  * @date 2017/07/15
  */
@SpringBootTest
abstract class RESTAbstractSpec extends FlatSpec with Matchers with OptionValues with Inside with Inspectors {


}


