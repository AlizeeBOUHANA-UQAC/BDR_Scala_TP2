/*package functional

import controllers.{SearchController, routes}
import org.scalatest.concurrent.ScalaFutures
import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.http.Status
import play.api.mvc._
import play.api.test.Helpers._
import play.api.test._

import scala.concurrent.Future

/**
 * Functional specification that has a running Play application.
 *
 * This is good for testing filter functionality, such as CSRF token and template checks.
 *
 * See https://www.playframework.com/documentation/2.7.x/ScalaFunctionalTestingWithScalaTest for more details.
 */
class FunctionalSpec extends PlaySpec with GuiceOneAppPerSuite with Injecting with ScalaFutures {

  // CSRF token helper adds "withCSRFToken" to FakeRequest:
  // https://www.playframework.com/documentation/2.7.x/ScalaCsrf#Testing-CSRF
  import CSRFTokenHelper._

  "SearchController" must {

    "process a POST request successfully" in {
      // Pull the controller from the already running Play application, using Injecting
      val controller = inject[SearchController]

      // Call using the FakeRequest and the correct body information and CSRF token
      val request = FakeRequest(routes.SearchController.createReqSearch())
        //.withFormUrlEncodedBody("opt1" -> "foo", "opt2" -> "http://localhost:9000/", "opt3" -> "100", "opt4" -> "male")
        .withCSRFToken
      val futureResult: Future[Result] = controller.createReqSearch().apply(request)

      // And we can get the results out using Scalatest's "Futures" trait, which gives us whenReady
      whenReady(futureResult) { result =>
        result.header.headers(LOCATION) must equal(routes.SearchController.listSearch().url)
      }
    }

    "reject a POST request when given bad input" in {
      val controller = inject[SearchController]

      // Call the controller with negative price...
      val request = FakeRequest(routes.SearchController.createReqSearch())
        //.withFormUrlEncodedBody("opt1" -> "foo", "opt2" -> "http://localhost:9000/", "opt3" -> "100", "opt4" -> "male")
        .withCSRFToken
      val futureResult: Future[Result] = controller.createReqSearch().apply(request)

      status(futureResult) must be(Status.BAD_REQUEST)
    }
  }

}*/
