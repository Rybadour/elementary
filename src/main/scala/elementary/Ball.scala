package elementary

class Ball(game: MyTestGame, _x: Int, _y: Int) extends Entity(game)
  with Position
  with Velocity
  with PositionRenderer
{
    x = _x
    y = _y
}
