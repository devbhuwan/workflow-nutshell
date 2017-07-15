package orderservice.rest

import orderservice.OrderServiceApplication
import org.scalatest.{BeforeAndAfterEach, Suite}
import org.springframework.test.context.support.AnnotationConfigContextLoader
import org.springframework.test.context.{ContextConfiguration, TestContextManager}

/**
  * @author Bhuwan Upadhyay
  *
  */
@ContextConfiguration(classes = Array(classOf[OrderServiceApplication]), loader = classOf[AnnotationConfigContextLoader])
trait ScalaSpringBootTest extends BeforeAndAfterEach {

  this: Suite =>

  override def beforeEach(): Unit = {
    new TestContextManager(classOf[ScalaSpringBootTest]).prepareTestInstance(this)
    super.beforeEach()
  }

}
