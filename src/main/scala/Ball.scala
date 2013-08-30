package elementary

class Ball() extends Entity with CollisionRect with StringRenderer
{
  var name = "Ball"
  var id = 2
  val str = name+" #"+id
}
