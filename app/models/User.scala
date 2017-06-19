package models

case class User(id: Long, name: String, age: Integer)

object User {

  private var users: List[User] = List(
    User(1, "Jim", 39),
    User(2, "Lili", 31),
    User(3, "Maxi", 3)
  )

  def findAll: List[User] = { users.sortBy(_.name) }

  def findById(userId: Long) = users.find(_.id == userId)

  def add(name: String, age: Integer) = {
    val id = users.last.id + 1
    val user = User(id, name, age)
    users = users ++ List(user)
  }

  def delete(id: Long) = {
    users = users.filterNot(user => user.id == id)
  }
}
