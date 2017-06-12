package models

case class User(id: Long, name: String, age: Integer)

object User {
  var users = Set(
    User(1, "Jim", 39),
    User(2, "Lili", 30),
    User(3, "Maxi", 3)
  )
  def findAll = users.toList.sortBy(_.name)
  def findById(id: Long) = users.find(_.id == id)
}
