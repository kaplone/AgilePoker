import com.raquo.laminar.api.L._
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom
import org.scalajs.dom.HTMLDivElement

object AgilePokerFrontEnd {

  def main(args: Array[String]): Unit = {

    val appContainer: dom.Element = dom.document.querySelector("#appContainer")
    val appElement: Div = div(
      h2("Register in Agile Poker", cls := "h2-1"),
      div(cls := "form__group field",
        label("Name", cls := "form__label"),
        input(cls := "form__field"),
        button(" Log in", cls := "button-3", role := "button")
      )

    )

    // this is how you render the appElement in the browser
    render(appContainer, appElement)
  }
}


// 1) Run "fastOptJS" in sbt console to build js file
// 2) open index.html
