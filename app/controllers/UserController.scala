package controllers

import models.User
import play.api.mvc.{Action, Controller}

class UserController extends Controller {

  def index = Action {
    Redirect(routes.UserController.list())
  }

  def list = Action {
    val users = User.findAll
    Ok(views.html.users.list(users))
  }

  def addUser = Action(parse.urlFormEncoded) {
    implicit request =>
      var name = request.body.get("name").get.head
      //val age = request.body.get("age").get.head
      User.add(name, 0)
      Redirect(routes.UserController.list())
  }

  def details(id: Long) = Action {
    User.findById(id).map { user =>
      Ok(views.html.users.details(user))
    }.getOrElse(NotFound)
  }

}
