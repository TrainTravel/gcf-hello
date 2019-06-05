import scala.scalajs.js
import scala.scalajs.js.annotation._
import facade.Response

object Main {
  @JSExportTopLevel("helloGET")
  def helloGET(req: js.Object, res: Response): Unit = {
    println("Hello, Vpon!")
    res.send("Hello, Vpon!")
  }
}
