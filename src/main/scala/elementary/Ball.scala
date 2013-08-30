package elementary

class Ball(_x: Int, _y: Int) extends Entity
  with Position
  with Velocity
  with PositionRenderer
{
    var id: Int = 3
    x = _x
    y = _y
}
