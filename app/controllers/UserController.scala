package controllers

import play.api.libs.json.Json

class UserController {

//  def getUsers: Nothing = {
//    val users = Database.getUsers
//    ok(Json.toJson(users))
//  }

//  def getUser(id: Long): Nothing = {
//    val user = Database.getUser(id)
//    if (user == null) notFound
//    else ok(Json.toJson(user))
//  }
//
//  def createUser: Nothing = {
//    val newUser = Json.fromJson(request.body.asJson, classOf[Nothing])
//    val inserted = Database.addUser(newUser)
//    created(Json.toJson(inserted))
//  }
//
//  def updateUser(id: Long): Nothing = {
//    val user = Json.fromJson(request.body.asJson, classOf[Nothing])
//    val updated = Database.updateUser(id, user)
//    ok(Json.toJson(updated))
//  }
//
//  def deleteUser(id: Long): Nothing = {
//    Database.deleteUser(id)
//    noContent // http://stackoverflow.com/a/2342589/1415732
//
//  }

}
