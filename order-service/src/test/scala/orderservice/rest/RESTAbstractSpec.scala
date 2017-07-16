package orderservice.rest

import akka.http.scaladsl.testkit.Specs2RouteTest
import org.scalatest._
import org.scalatest.prop.Configuration

/**
  * @author Bhuwan Upadhyay
  *
  */
abstract class RESTAbstractSpec extends FlatSpec with ScalaSpringBootTest with Specs2RouteTest with Configuration with Matchers with OptionValues with Inside with Inspectors {

}


