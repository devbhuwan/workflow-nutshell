package orderservice.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

import scala.beans.BeanProperty

/**
  * @author Bhuwan Upadhyay
  *
  */
@JsonIgnoreProperties(ignoreUnknown = true)
class Order {
  @BeanProperty
  var id: Long = _
  @BeanProperty
  var detail: String = _
}
