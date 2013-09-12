package elementary.TR.physics

trait HasAcceleration {
  self: HasVelocity =>

  val acceleration: Position2 = new Position2(0, 0)

  def apply_acceleration() = {
    this.velocity += acceleration

    acceleration.x = 0
    acceleration.y = 0
  }
}
