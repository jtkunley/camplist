package controllers

import javax.inject._

import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class MessageController @Inject() extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def simple = Action {
    Ok(views.html.messages.simple("hello world"))
  }

  def echo(msg: String) = Action {
    Ok(views.html.messages.echo(msg))
  }
}
