package controllers

import javax.inject.{Inject, Singleton}

import models.User
import play.api.mvc.{Action, Controller}

@Singleton
class UserController @Inject() extends Controller {

  def list = Action {
    val users = User.findAll
    Ok(views.html.users.list(users))
  }

  def details(id: Long) = Action {
    User.findById(id).map { user =>
      Ok(views.html.users.details(user))
    }.getOrElse(NotFound)
  }

}
