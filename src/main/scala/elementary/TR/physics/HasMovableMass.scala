package elementary.TR.physics

trait HasMovableMass {
  self: HasAcceleration with HasMass

  protected var massForceMultiplier: Float = 1

  protected var perSecDrag: Float = 1
  protected var massDragMultiplier: Float = 0.01

  def add_force(force: Position2) = {
    this.acceleration += (force / (this.mass * massForceMultiplier))
  }

  def apply_drag(frameStepMulitplier: Float) = {
    var drag: Float = (perSecDrag * frameStepMulitplier) + (this.mass * massDragMultiplier)

    if (drag < (this.velocity.getMagnitude() + this.acceleration.getMagnitude())) {
      this.acceleration += this.velocity.getNormalized().getReversed() * drag
    }
  }
}
