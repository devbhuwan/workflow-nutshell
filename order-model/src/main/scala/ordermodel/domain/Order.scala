package ordermodel.domain

import scala.beans.BeanProperty

/**
  * @author Bhuwan Upadhyay
  *
  */
class Order {
  @BeanProperty
  var id: Long = _
  @BeanProperty
  var detail: String = _
}
