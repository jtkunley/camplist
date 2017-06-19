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

  def addForm = Action {
    Ok(views.html.users.add())
  }

  def add = Action(parse.urlFormEncoded) {
    implicit request =>
      var name = request.body.get("name").get.head
      var age = request.body.get("age").get.head
      User.add(name.trim(), Integer.parseInt(age.trim()))
      Redirect(routes.UserController.index())
  }

  def delete(userId: Long) = Action {
    User.delete(userId)
    Ok
  }

  def details(id: Long) = Action {
    User.findById(id).map { user =>
      Ok(views.html.users.details(user))
    }.getOrElse(
        Redirect(routes.UserController.index())
      )
  }

}
