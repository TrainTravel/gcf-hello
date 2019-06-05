package facade

import scala.scalajs.js

@js.native
trait Response extends js.Object {
  def send(body: String): Unit = js.native
}
