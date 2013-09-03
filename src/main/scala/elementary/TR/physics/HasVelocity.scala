package elementary.TR.physics

trait HasVelocity {
  self: HasPosition =>

  val velocity: Position2 = new Position2(0, 0)

  def apply() = {
    this.position += velocity
  }
}
