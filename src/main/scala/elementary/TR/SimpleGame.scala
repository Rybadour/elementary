package elementary.TR.core

class SimpleGame(canvasId: String) extends Scene() {

  protected val pageCanvas: Canvas = new Canvas(canvasId)
  protected val layers: Map[String, Canvas]

  def addToLayer(renderer: CanvasRenderer, layer: String) = {
      if (layers.exists(layer))
      {
          layers.get(layer).add(renderer)
      }
  }

  override def update(msTimeStep: Int) {
    // Propagate update flow
    super.update(msTimeStep)

    // Apply physics (velocity)

    // Iterate over layers
    // Render to page
  }
}
