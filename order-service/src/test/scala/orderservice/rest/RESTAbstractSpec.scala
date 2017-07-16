package orderservice.rest

import org.scalatest._
import org.scalatest.prop.Configuration
import spray.testkit.Specs2RouteTest

/**
  * @author Bhuwan Upadhyay
  *
  */
abstract class RESTAbstractSpec extends FlatSpec with ScalaSpringBootTest with Specs2RouteTest with Configuration with Matchers with OptionValues with Inside with Inspectors {

}


