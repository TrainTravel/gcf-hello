import scala.scalajs.js
import scala.scalajs.js.annotation._
import facade.HelloFacade._

object Main {
  @JSExportTopLevel("helloGET")
  def helloGET(req: js.Object, res: Response): Unit = {
    println("Hello, Vpon!")
    res.send("Hello, Vpon!")
  }
}
