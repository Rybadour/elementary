package elementary

trait Velocity {
  self: Position =>

  private var vector: Vector2 = new Vector2(0, 0)
  def apply() = {
      x += vector.x
      y += vector.y
  }

  def setVector2(x: Int, y: Int) = {
    vector.x = x
    vector.y = y
  }
}
