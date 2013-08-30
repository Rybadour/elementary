package elementary

trait PositionRenderer extends StringRenderer {
  self: Position =>
  
  private var vector: Vector2 = new Vector2(0, 0)
  override val str: String = 
    "Position: ("+(this.x + vector.x)+", "+(this.y + vector.y)+")"

  def setVector(x: Int, y: Int) = {
    vector.x = x
    vector.y = y
  }
}
